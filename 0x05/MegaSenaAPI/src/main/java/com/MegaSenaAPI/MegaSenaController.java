package com.MegaSenaAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST Controller for Mega Sena API.
 */
@RestController
@RequestMapping(value = "/megasena")
public class MegaSenaController {

    /**
     * Welcome message endpoint.
     *
     * @return welcome string
     */
    @GetMapping("/simpleMessageWelcome")
    public String welcomeMessage() {
        return "Welcome to the REST API for generating numbers for the Mega Sena lottery.";
    }

    /**
     * Generates 6 random numbers between 1 and 60.
     *
     * @return list of sorted numbers in ascending order
     */
    @GetMapping("/getNumbers")
    public List<Integer> megaSenaNumbers() {

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        while (numbers.size() < 6) {
            int num = random.nextInt(60) + 1;

            if (!numbers.contains(num)) {
                numbers.add(num);
            }
        }

        Collections.sort(numbers);
        return numbers;
    }
}
