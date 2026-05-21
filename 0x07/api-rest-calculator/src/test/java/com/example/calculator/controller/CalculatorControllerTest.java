package com.example.calculator.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * Controller tests for Calculator REST API.
 */
@ExtendWith(SpringExtension.class)
@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void messageWelcome() throws Exception {

        MvcResult result = mvc.perform(get("/calculator/welcome")).andReturn();

        assertEquals("Welcome to CALCULATOR API REST.",
            result.getResponse().getContentAsString());
    }

    @Test
    void addNumbers() throws Exception {

        MvcResult result = mvc.perform(
            get("/calculator/addNumbers")
            .param("number1", "2")
            .param("number2", "3"))
            .andReturn();

        assertEquals("5.0", result.getResponse().getContentAsString());
    }
}
