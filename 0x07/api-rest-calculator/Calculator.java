package com.example.calculator.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Calculator class that performs basic mathematical operations.
 */
public class Calculator {

    /**
     * Sum two numbers.
     *
     * @param number1 first number
     * @param number2 second number
     * @return sum of both numbers
     */
    public Double sum(Double number1, Double number2) {

        if (number1 == null || number2 == null) {
            throw new NullPointerException("Number 1 and Number 2 are required.");
        }

        return number1 + number2;
    }

    /**
     * Subtract two numbers.
     *
     * @param number1 first number
     * @param number2 second number
     * @return result of subtraction
     */
    public Double sub(Double number1, Double number2) {

        if (number1 == null || number2 == null) {
            throw new NullPointerException("Number 1 and Number 2 are required.");
        }

        return number1 - number2;
    }

    /**
     * Divide two numbers.
     *
     * @param number1 numerator
     * @param number2 denominator
     * @return division result
     */
    public Double divide(Double number1, Double number2) {

        if (number1 == null || number2 == null) {
            throw new NullPointerException("Number 1 and Number 2 are required.");
        }

        if (number2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        return number1 / number2;
    }

    /**
     * Calculate factorial of a number.
     *
     * @param factorial input number
     * @return factorial result
     */
    public Integer factorial(Integer factorial) {

        if (factorial == null) {
            throw new NullPointerException("Number is required.");
        }

        int result = 1;

        for (int i = 1; i <= factorial; i++) {
            result *= i;
        }

        return result;
    }

    /**
     * Convert integer to binary.
     *
     * @param integer input number
     * @return binary representation
     */
    public Integer integerToBinary(Integer integer) {

        if (integer == null) {
            throw new NullPointerException("Number is required.");
        }

        return Integer.parseInt(Integer.toBinaryString(integer));
    }

    /**
     * Convert integer to hexadecimal.
     *
     * @param integer input number
     * @return hexadecimal string
     */
    public String integerToHexadecimal(Integer integer) {

        if (integer == null) {
            throw new NullPointerException("Number is required.");
        }

        return Integer.toHexString(integer).toUpperCase();
    }

    /**
     * Calculate days between two dates.
     *
     * @param date1 first date
     * @param date2 second date
     * @return number of days between dates
     */
    public int calculeDayBetweenDate(LocalDate date1, LocalDate date2) {

        return (int) Math.abs(ChronoUnit.DAYS.between(date1, date2));
    }
}
