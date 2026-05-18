package com.example.user.exception;

/**
 * Exception for invalid CPF.
 */
public class CPFException extends RuntimeException {

    public CPFException(String message) {
        super(message);
    }
}
