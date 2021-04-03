package com.webler.awsdeploydemo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class ApiController {

    @GetMapping("/health")
    public ResponseEntity<?> healthCheck(){
        return ResponseEntity.ok("It works successfully");

    }
}
