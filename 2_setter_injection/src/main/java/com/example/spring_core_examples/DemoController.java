package com.example.spring_core_examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Team emp ;

    @Autowired
    public void gotoTeam(Team emp)
    {
        this.emp = emp;
    }

    @GetMapping("/")
    public String getEmp() {
        return emp.getEmployeeDetails();
    }
}
