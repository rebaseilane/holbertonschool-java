package com.example.user.controller;

import org.springframework.web.bind.annotation.*;

import com.example.user.exception.CPFException;
import com.example.user.exception.UserIdException;
import com.example.user.exception.UserNameException;

/**
 * REST controller for user validation API.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    /**
     * Validate user ID.
     */
    @GetMapping("/user-id/{id}")
    public String findUserById(@PathVariable int id) {

        if (id > 0 && id < 100) {
            return "You have entered a valid ID";
        } else {
            throw new UserIdException("ID " + id);
        }
    }

    /**
     * Validate username.
     */
    @GetMapping("/user-name/{userName}")
    public String findUserByUserName(@PathVariable String userName) {

        if (userName.length() > 3 && userName.length() < 15) {
            return "You have entered a valid USERNAME";
        } else {
            throw new UserNameException("USERNAME " + userName);
        }
    }

    /**
     * Validate CPF.
     */
    @GetMapping("/user-cpf/{cpf}")
    public String findUserByCPF(@PathVariable String cpf) {

        if (isCPF(cpf)) {
            return "You have entered a valid CPF";
        } else {
            throw new CPFException("CPF " + cpf);
        }
    }

    /**
     * CPF validation method.
     */
    public boolean isCPF(String cpf) {

        return cpf != null && cpf.length() > 3 && cpf.length() < 15;
    }
}
