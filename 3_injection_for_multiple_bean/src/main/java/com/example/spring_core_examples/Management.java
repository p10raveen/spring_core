package com.example.spring_core_examples;

import org.springframework.stereotype.Component;

@Component
public class Management implements Team{
    @Override
    public String getEmployeeDetails() {
        return "I am from Management Department";
    }
}
