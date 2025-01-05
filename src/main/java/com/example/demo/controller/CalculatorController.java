package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Struct;

@RestController
@RequestMapping("api/calculator")
public class CalculatorController {
    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        return a * b;
    }

    @GetMapping("/subtraction")
    public int subtraction(@RequestParam int a, @RequestParam int b) {
        return a - b;
    }

    @GetMapping("/division")
    public int division(@RequestParam int a, @RequestParam int b) {
        return a / b;
    }

    @GetMapping("/modulus")
    public int modulus(@RequestParam int a, @RequestParam int b) {
        return a % b;
    }

    @GetMapping("/factorial")
    public int factorial(@RequestParam int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    @GetMapping("/prime")
    public String primeNumber(@RequestParam int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            return number + "is prime";
        } else {
            return number + "is not prime";
        }
    }

    @GetMapping("/evenOdd")
    public String evenOdd(@RequestParam int number){
        if (number%2==0){
            return "even";
        }else{
            return "odd";
        }
    }
}
