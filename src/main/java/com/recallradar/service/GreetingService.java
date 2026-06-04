package com.recallradar.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService{

    public String greet(){
        return "Welcome to Recall Radar";
    }
}