package com.example.jpah2demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class for Spring Boot application.
 *
 * Starts the JPA + H2 demo application.
 */
@SpringBootApplication
public class JpaH2DemoApplication {

    /**
     * Main method.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(JpaH2DemoApplication.class, args);
    }
}
