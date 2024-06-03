package com.example.spring_core_examples.bean;

import com.example.interfaces.Team;
import org.springframework.stereotype.Component;

@Component
public class Management implements Team {
    @Override
    public String getEmployeeDetails() {
        return "I am from Management Department";
    }
}
