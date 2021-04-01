package kr.scalar.api.usr.domain;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Size;

import kr.scalar.api.rev.domain.Review;
import org.hibernate.annotations.CreationTimestamp;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder @Data
@Entity
@NoArgsConstructor
@AllArgsConstructor @Table(name="users")
public class UserVo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long num;
    private String role;
    private String provider;
    private String providerId;


    private String age;
    private String gender;


    @CreationTimestamp
    private Timestamp createDate;

    @OneToMany(mappedBy = "user")
    private List<Review> reviews = new ArrayList<>();


   @Size(min = 4, max = 255, message = "Minimum username length: 4 characters")
    @Column(unique = true, nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @Size(min = 4, message = "Minimum password length: 4 characters")
    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    List<Role> roles;
}
