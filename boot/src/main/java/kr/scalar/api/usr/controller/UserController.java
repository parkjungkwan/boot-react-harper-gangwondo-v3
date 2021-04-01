package kr.scalar.api.usr.controller;

import java.util.List;
import java.util.Optional;

import io.swagger.annotations.*;
import kr.scalar.api.usr.domain.UserDto;
import kr.scalar.api.usr.domain.UserVo;
import kr.scalar.api.usr.service.UserServiceImpl;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;


@RestController
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RequiredArgsConstructor
@RequestMapping("/users")
@Api(tags = "users")
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final UserServiceImpl userService;
    private final ModelMapper modelMapper;

    @PostMapping("/signup")
    @ApiOperation(value = "${UserController.signup}")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 403, message = "Access denied"),
            @ApiResponse(code = 422, message = "Username is already in use") })
    public ResponseEntity<String> save(@ApiParam("Signup User") @RequestBody UserDto user) {
        logger.info("회원 가입정보"+user.toString());

        return ResponseEntity.ok(userService.save(modelMapper.map(user, UserVo.class)));
    }
    @PostMapping("/signin")
    public ResponseEntity<String> login(@RequestBody UserVo user) {
        logger.info("회원 로그인정보"+user.toString());
        return ResponseEntity.ok(userService.login(user.getUsername(), user.getPassword()));
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Long> delete(@RequestBody UserVo t) {
        return ResponseEntity.ok(userService.delete(t));
    }
    @GetMapping("/count")
    public ResponseEntity<Long> count() {
        return ResponseEntity.ok(userService.count());
    }
    @GetMapping("/all")
    public ResponseEntity<List<UserVo>> findAll() {
        logger.info("모든 유저정보 불러오기");
        return ResponseEntity.ok(userService.findAll());
    }
    @GetMapping("/one/{id}")
    public ResponseEntity<UserVo> getOne(@PathVariable long id) {
        return ResponseEntity.ok(userService.getOne(id));
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Optional<UserVo>> findById(@PathVariable long id) {
        return ResponseEntity.ok(userService.findById(id));
    }
    @GetMapping("/exists/{id}")
    public ResponseEntity<Boolean> existsById(@PathVariable long id) {
        return ResponseEntity.ok(userService.existsById(id));
    }
}
