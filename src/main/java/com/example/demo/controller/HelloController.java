package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping ("/api")
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/danish")
    public String danish() {
        return "danish";
    }

    @GetMapping("/developer")
    public String developer() {
        return "developer";
    }

    @GetMapping("/names")
    public ArrayList<String> getNames() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Danish");
        names.add("Heena");
        names.add("Afreen");
        names.add("Bushra");
        return names;
    }

    @GetMapping("/name-age")
    public HashMap<String, Integer> getNamesAge() {
        HashMap<String, Integer> nameAge = new HashMap<>();
        nameAge.put("Danish", 26);
        nameAge.put("Heena", 32);
        nameAge.put("Afreen", 30);
        nameAge.put("Bushra", 28);
        return nameAge;
    }

    @GetMapping("/factorial")
    public int calculateFactorial(@RequestParam int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
    
}
