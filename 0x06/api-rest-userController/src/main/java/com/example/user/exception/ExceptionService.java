package com.example.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * Global exception handler.
 */
@ControllerAdvice
public class ExceptionService {

    /**
     * Handle UserIdException.
     */
    @ExceptionHandler(UserIdException.class)
    public ResponseEntity<UserErrorResponse> handleUserIdException(UserIdException err) {

        UserErrorResponse response = new UserErrorResponse();
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        response.setMessage("You have entered an invalid ID: " + err.getMessage());

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    /**
     * Handle UserNameException.
     */
    @ExceptionHandler(UserNameException.class)
    public ResponseEntity<UserErrorResponse> handleUserNameException(UserNameException err) {

        UserErrorResponse response = new UserErrorResponse();
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        response.setMessage("You have entered an invalid USERNAME: " + err.getMessage());

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    /**
     * Handle CPFException.
     */
    @ExceptionHandler(CPFException.class)
    public ResponseEntity<UserErrorResponse> handleCPFException(CPFException err) {

        UserErrorResponse response = new UserErrorResponse();
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        response.setMessage("You have entered an invalid CPF: " + err.getMessage());

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
