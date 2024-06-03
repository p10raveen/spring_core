package com.example.spring_core_examples;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Legal implements Team{
    @Override
    public String getEmployeeDetails() {
        return "I am from Legal Department";
    }
}
