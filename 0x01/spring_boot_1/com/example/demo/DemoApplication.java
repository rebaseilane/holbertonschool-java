package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * DemoApplication
 *
 * Entry point of the Spring Boot application.
 * Initializes and runs the embedded server.
 */
@SpringBootApplication
public class DemoApplication
{
    /**
     * main - starts the Spring Boot application
     *
     * @param args command line arguments
     */
    public static void main(String[] args)
    {
        SpringApplication.run(DemoApplication.class, args);
    }
}
