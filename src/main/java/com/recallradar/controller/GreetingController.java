package com.recallradar.controller;
import com.recallradar.service.GreetingService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    
    private final GreetingService greetingService;

    public GreetingController(GreetingService param_greetingService) {
        greetingService = param_greetingService;
    }

    @GetMapping("/greet")
    public String greet_user(){
        return greetingService.greet();
    }


}
