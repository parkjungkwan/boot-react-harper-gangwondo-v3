package kr.scalar.api.usr.service;
import kr.scalar.api.cmm.service.AbstractService;
import kr.scalar.api.sec.domain.SecurityProvider;
import kr.scalar.api.sec.exception.SecurityRuntimeException;
import kr.scalar.api.usr.domain.Role;
import kr.scalar.api.usr.domain.UserVo;
import kr.scalar.api.usr.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl  extends AbstractService<UserVo> implements UserService{
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final SecurityProvider provider;
    private final AuthenticationManager manager;

    @Override
    public String save(UserVo user) {
        if (!userRepository.existsByUsername(user.getUsername())) {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            List<Role> list = new ArrayList<>();
            list.add(Role.USER);
            user.setRoles(list);
            userRepository.save(user);

            return provider.createToken(user.getUsername(), user.getRoles());
        } else {
            throw new SecurityRuntimeException("Username is already in use", HttpStatus.UNPROCESSABLE_ENTITY);
        }

        // return (userRepository.save(t) != null) ? 1 : 0;}
    }
    @Override
    public long delete(UserVo t) {
        userRepository.delete(t); return (existsById(t.getNum())) ? 0 : 1;}

    @Override
    public long count() {
        return userRepository.count();}

    @Override
    public UserVo getOne(long id) {
        return userRepository.getOne(id);}


    @Override
    public Optional<UserVo> findById(long id) {
        return userRepository.findById(id);}

    @Override
    public boolean existsById(long id) {
        return userRepository.existsById(id);}

    @Override
    public List<UserVo> findAll() {
        return userRepository.findAll();}


    @Override
    public String login(String username, String password) {
        try {
            //	manager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
            System.out.println("ID:  "+username);
            String tok = provider.createToken(username, userRepository.findByUsername(username).getRoles());
            System.out.println("token :: "+tok);
            return tok;
        } catch (AuthenticationException e) {
            throw new SecurityRuntimeException("Invalid username/password supplied", HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }
}
