package com.example.demo.controller;

import com.example.demo.groups.GroupA;
import com.example.demo.groups.GroupB;
import com.example.demo.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @PostMapping("/group-a")
    public ResponseEntity<Object> groupA(@Validated(GroupA.class) @RequestBody Person person) {
        return new ResponseEntity<>("Todo bien en el grupo A",HttpStatus.OK);
    }
    
    @PostMapping("/group-b")
    public ResponseEntity<Object> groupB(@Validated(GroupB.class) @RequestBody Person person) {
        return new ResponseEntity<>("Todo bien en el grupo B",HttpStatus.OK);
    }
}
