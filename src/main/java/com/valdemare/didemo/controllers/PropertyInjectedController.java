package com.valdemare.didemo.controllers;

import com.valdemare.didemo.services.GreetingService;
import com.valdemare.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingService;

    public String sayHello (){
        return greetingService.sayGreeting();
    }


}
