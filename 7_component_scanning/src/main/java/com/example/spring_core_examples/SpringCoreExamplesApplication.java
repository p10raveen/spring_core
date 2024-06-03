package com.example.spring_core_examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"com.example.interfaces","com.example.spring_core_examples"
		}
)
public class SpringCoreExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreExamplesApplication.class, args);
	}

}
