package com.example.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloWorldResource
 *
 * REST controller exposing home endpoint.
 */
@RestController
@RequestMapping(value = "/messages")
public class HelloWorldResource
{
    /**
     * home - returns success message
     *
     * Return: success string
     */
    @GetMapping("/home")
    public String home()
    {
        return "MAVEN PROJECT (SPRING INITIALIZR) SUCCESSFULLY CREATED!!!";
    }
}
