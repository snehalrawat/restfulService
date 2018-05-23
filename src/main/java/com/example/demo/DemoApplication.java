package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.howtodoinjava.demo.controller.EmployeeController;
import com.howtodoinjava.demo.model.Employee;

@SpringBootApplication (exclude = SecurityAutoConfiguration.class)
@ComponentScan(basePackageClasses = Employee.class)
@ComponentScan(basePackageClasses = EmployeeController.class)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
