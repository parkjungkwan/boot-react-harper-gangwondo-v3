package kr.scalar.api.usr.service;

import kr.scalar.api.usr.domain.UserDto;
import kr.scalar.api.usr.domain.UserVo;
import org.springframework.security.core.userdetails.UserDetailsService;

import javax.servlet.http.HttpServletRequest;

public interface UserService {
    String login(String username, String password);
    String save(UserVo user);
}
