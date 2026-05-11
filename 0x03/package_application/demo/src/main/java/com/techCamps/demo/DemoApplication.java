package com.techCamps.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * DemoApplication class.
 *
 * Main entry point for the Spring Boot JPA application.
 *
 * @author TechCamps
 * @version 1.0
 */
@SpringBootApplication
public class DemoApplication
{
	/**
	 * Main method that starts the Spring Boot application.
	 *
	 * @param args command-line arguments
	 */
	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);
	}
}
