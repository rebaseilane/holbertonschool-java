package com.example.calculator.model;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for Calculator class.
 */
public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void sumTest() {

        assertEquals(5.0, calculator.sum(2.0, 3.0));
    }

    @Test
    public void numbersNullSumTest() {

        assertThrows(NullPointerException.class,
            () -> calculator.sum(null, null));
    }

    @Test
    void subTest() {

        assertEquals(2.0, calculator.sub(5.0, 3.0));
    }

    @Test
    void divideTest() {

        assertEquals(2.0, calculator.divide(6.0, 3.0));
    }

    @Test
    public void divisionByZeroTest() {

        assertThrows(ArithmeticException.class,
            () -> calculator.divide(6.0, 0.0));
    }

    @Test
    void factorialTest() {

        assertEquals(120, calculator.factorial(5));
    }

    @Test
    void integerToBinaryTest() {

        assertEquals(101, calculator.integerToBinary(5));
    }

    @Test
    void integerToHexadecimalTest() {

        assertEquals("37", calculator.integerToHexadecimal(55));
    }

    @Test
    void calculeDayBetweenDateTest() {

        LocalDate d1 = LocalDate.of(2020, 3, 15);
        LocalDate d2 = LocalDate.of(2020, 3, 29);

        assertEquals(14, calculator.calculeDayBetweenDate(d1, d2));
    }
}
