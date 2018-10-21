package com.redoy.test.repository;

import org.springframework.stereotype.Repository;

@Repository
public class TestRepository {

    public String getTestResult(){
        return "Hello from Repository";
    }
}
