package com.example.spring_core_examples;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Management implements Team{
    @Override
    public String getEmployeeDetails() {
        return "I am from Management Department";
    }
}
