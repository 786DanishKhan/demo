package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
