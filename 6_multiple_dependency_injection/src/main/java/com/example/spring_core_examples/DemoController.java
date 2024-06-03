package com.example.spring_core_examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Team emp1 ;
    private Team emp2 ;

    @Autowired
    public void gotoTeam(@Qualifier("legal") Team emp1,@Qualifier("legal") Team emp2)
    {
        this.emp1 = emp1;
        this.emp2 = emp2;
    }

    @GetMapping("/")
    public boolean getEmp() {
        return emp1==emp2;
    }
}

