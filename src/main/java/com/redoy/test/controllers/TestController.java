package com.redoy.test.controllers;

import com.redoy.test.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestRepository testRepository;

    @RequestMapping("/greeting")
    public String greeting() {
        return testRepository.getTestResult();
    }
}
