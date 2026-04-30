package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * MessageResource
 *
 * REST controller that exposes microservice endpoints.
 */
@RestController
@RequestMapping(value = "/messages")
public class MessageResource
{
    /**
     * simpleMessageWelcome - returns a welcome message
     *
     * Return: welcome message string
     */
    @GetMapping("/simpleMessageWelcome")
    public String simpleMessageWelcome()
    {
        return "WELCOME TO THE MICRO-SERVICE CLASS USING SPRING BOOT!!!";
    }

    /**
     * login - validates user credentials
     *
     * @param user username provided
     * @param password password provided
     *
     * Return: validation result message
     */
    @GetMapping("/login")
    public String login(@RequestParam(required = false) String user,
                        @RequestParam(required = false) String password)
    {
        if (user == null || password == null ||
            user.isEmpty() || password.isEmpty())
        {
            return "USER AND PASSWORD NOT PROVIDED";
        }

        if (user.length() > 15 || password.length() > 15)
        {
            return "USER AND PASSWORD INVALID";
        }

        return "LOGIN SUCCESSFUL!!!";
    }
}
