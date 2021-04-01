package kr.scalar.api.svy.controller;

import java.util.List;

import kr.scalar.api.svy.domain.Survey;
import kr.scalar.api.svy.service.SurveyServiceImpl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
@RequiredArgsConstructor
@CrossOrigin("*")
@RequestMapping("/survey")
public class SurveyController {
    final SurveyServiceImpl service;

    @PostMapping("/save")
    public ResponseEntity<Integer> save(@RequestBody Survey s){
        return ResponseEntity.ok(service.save(s));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Integer> delete(@RequestBody Survey s){
        return ResponseEntity.ok(service.delete(s));
    }

    @GetMapping("/count")
    public ResponseEntity<Integer> count(){
        return ResponseEntity.ok(service.count());
    }

    @GetMapping("/one/{id}")
    public ResponseEntity<Survey> getOne(@PathVariable int id){
        return ResponseEntity.ok(service.getOne(id));
    }

    @GetMapping("/exists/{id}")
    public ResponseEntity<Boolean> existsById(@PathVariable int id){
        return ResponseEntity.ok(service.existsById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Survey>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/list")
    public ResponseEntity<Page<Survey>> findList(Pageable pageable){
        return ResponseEntity.ok(service.findList(pageable));
    }
}
