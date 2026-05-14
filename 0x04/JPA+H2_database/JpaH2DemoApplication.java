package com.example.jpa_h2_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for the JPA + H2 Demo application.
 *
 * This class bootstraps the Spring Boot application.
 */
@SpringBootApplication
public class JpaH2DemoApplication {

    /**
     * Main method used to launch the application.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(JpaH2DemoApplication.class, args);
    }
}
