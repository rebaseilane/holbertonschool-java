package com.example.user.exception;

/**
 * Exception for invalid user ID.
 */
public class UserIdException extends RuntimeException {

    public UserIdException(String message) {
        super(message);
    }
}
