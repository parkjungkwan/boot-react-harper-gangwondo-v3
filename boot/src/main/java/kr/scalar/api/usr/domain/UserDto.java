package kr.scalar.api.usr.domain;
import java.sql.Timestamp;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data @Component
public class UserDto {
    private long num;
    @ApiModelProperty(position = 0)
    private String username;
    @ApiModelProperty(position = 1)
    private String email;
    @ApiModelProperty(position = 2)
    private String password;
    @ApiModelProperty(position = 3)
    List<Role> roles;

    private String provider;
    private String providerId;
    private String role;
    private String age;
    private String gender;
    private Timestamp createDate;
}
