package com.valdemare.didemo.controllers;

import com.valdemare.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("hello!");
        return greetingService.sayGreeting();
    }
}
