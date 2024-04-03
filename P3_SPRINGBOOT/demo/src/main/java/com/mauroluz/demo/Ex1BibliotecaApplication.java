package com.mauroluz.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mauroluz"})
public class Ex1BibliotecaApplication {
    public static void main(String[] args) {
        SpringApplication.run(Ex1BibliotecaApplication.class, args);
    }
}