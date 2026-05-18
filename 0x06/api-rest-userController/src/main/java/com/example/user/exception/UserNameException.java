package com.example.user.exception;

/**
 * Exception for invalid username.
 */
public class UserNameException extends RuntimeException {

    public UserNameException(String message) {
        super(message);
    }
}
