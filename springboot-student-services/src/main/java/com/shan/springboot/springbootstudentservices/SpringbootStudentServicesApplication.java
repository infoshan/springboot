package com.shan.springboot.springbootstudentservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.shan")
public class SpringbootStudentServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootStudentServicesApplication.class, args);
	}
}
