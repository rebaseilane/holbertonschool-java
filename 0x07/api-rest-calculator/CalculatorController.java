package com.example.calculator.controller;

import com.example.calculator.model.Calculator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller for Calculator API.
 */
@RestController
@RequestMapping(value = "/calculator")
public class CalculatorController {

    private final Calculator calculator = new Calculator();

    /**
     * Welcome message endpoint.
     *
     * @return welcome string
     */
    @GetMapping("/welcome")
    public String messageWelcome() {

        return "Welcome to CALCULATOR API REST.";
    }

    /**
     * Add two numbers.
     */
    @GetMapping("/addNumbers")
    public String addNumbers(@RequestParam(name = "number1") Double n1,
                             @RequestParam(name = "number2") Double n2) {

        return String.valueOf(calculator.sum(n1, n2));
    }

    /**
     * Subtract two numbers.
     */
    @GetMapping("/subNumbers")
    public String subNumbers(@RequestParam(name = "number1") Double n1,
                             @RequestParam(name = "number2") Double n2) {

        return String.valueOf(calculator.sub(n1, n2));
    }

    /**
     * Divide two numbers.
     */
    @GetMapping("/divideNumbers")
    public String divideNumbers(@RequestParam(name = "number1") Double n1,
                                 @RequestParam(name = "number2") Double n2) {

        return String.valueOf(calculator.divide(n1, n2));
    }

    /**
     * Factorial endpoint.
     */
    @GetMapping("/factorial")
    public String factorial(@RequestParam(name = "factorial") Integer factorial) {

        return String.valueOf(calculator.factorial(factorial));
    }

    /**
     * Days between dates.
     */
    @GetMapping("/calculeDayBetweenDate")
    public String calculeDayBetweenDate(
            @RequestParam("localDate1")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate1,
            @RequestParam("localDate2")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate2) {

        return String.valueOf(calculator.calculeDayBetweenDate(localDate1, localDate2));
    }

    /**
     * Convert integer to binary.
     */
    @GetMapping("/integerToBinary")
    public String integerToBinary(@RequestParam(name = "number1") Integer n1) {

        return String.valueOf(calculator.integerToBinary(n1));
    }

    /**
     * Convert integer to hexadecimal.
     */
    @GetMapping("/integerToHexadecimal")
    public String integerToHexadecimal(@RequestParam(name = "number1") Integer n1) {

        return calculator.integerToHexadecimal(n1);
    }
}
