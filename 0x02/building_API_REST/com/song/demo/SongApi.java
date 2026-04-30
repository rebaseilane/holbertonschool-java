package com.song.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SongApi
 *
 * Entry point for the Spring Boot application.
 */
@SpringBootApplication
public class SongApi
{
    /**
     * main - starts the application
     *
     * @param args command line arguments
     */
    public static void main(String[] args)
    {
        SpringApplication.run(SongApi.class, args);
    }
}
