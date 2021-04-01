package kr.scalar.api.cmm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return String.format("<h1>Boot Server Loaded At %s </h1>", new SimpleDateFormat("MM-dd HH:mm").format(new Date()));
    }
}
