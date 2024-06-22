package com.projectx.projectx.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class TestController {

    @GetMapping
    public ResponseEntity<String> getStatus(){
        return new ResponseEntity<>("Welcome",HttpStatus.OK);
    }
}
