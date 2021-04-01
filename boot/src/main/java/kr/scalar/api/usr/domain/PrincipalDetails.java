package kr.scalar.api.usr.domain;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.core.user.OAuth2User;

public class PrincipalDetails implements UserDetails, OAuth2User{
    private static final long serialVersionUID = 1L;
    private UserVo user;
    private Map<String, Object> attributes;

    // 일반 시큐리티 로그인시 사용
    public PrincipalDetails(UserVo user) {
        this.user = user;
    }

    // OAuth2.0 로그인시 사용
    public PrincipalDetails(UserVo user, Map<String, Object> attributes) {
        this.user = user;
        this.attributes = attributes;
    }
    public UserVo getUser() {
        return user;
    }
    public String getAge() {
        return user.getAge();
    }
    public void setAge(String age){
        this.user.setAge(age);
    }

    public String getGender() {
        return user.getGender();
    }
    public void setGender(String gender) {
        this.user.setGender(gender);
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> collet = new ArrayList<GrantedAuthority>();
        collet.add(()->{ return user.getRole();});
        return collet;
    }

    // 리소스 서버로 부터 받는 회원정보
    @Override
    public Map<String, Object> getAttributes() {
        return attributes;
    }

    // User의 PrimaryKey
    @Override
    public String getName() {
        return user.getNum()+"";
    }


}
