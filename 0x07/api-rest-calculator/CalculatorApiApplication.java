package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for Calculator REST API application.
 */
@SpringBootApplication
public class CalculatorApiApplication {

    /**
     * Starts the Spring Boot application.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(CalculatorApiApplication.class, args);
    }
}
