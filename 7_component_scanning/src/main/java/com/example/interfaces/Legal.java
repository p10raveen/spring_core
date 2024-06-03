package com.example.interfaces;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Legal implements Team {
    @Override
    public String getEmployeeDetails() {
        return "I am from Legal Department";
    }
}
