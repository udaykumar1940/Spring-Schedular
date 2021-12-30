package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.pojo.Employee;

@Configuration
public class Config {

	@Bean(name = "john")
    @Qualifier("john")
    public Employee JohnEmployee() {
    	System.out.println("John Employee");
        return new Employee("John");
    }

    @Bean(name = "tony")
    @Qualifier("tony")
    public Employee TonyEmployee() {
    	System.out.println("Tony Employee");
        return new Employee("Tony");
    }
}