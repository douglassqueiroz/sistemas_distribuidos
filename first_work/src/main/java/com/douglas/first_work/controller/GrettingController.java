package com.douglas.first_work.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.douglas.first_work.model.Gretting;

@RestController
@RequestMapping(value = "/add")
public class GrettingController {
    
    @GetMapping("/{n1}/{n2}")
    public Integer soma(@PathVariable("n1") int number1, @PathVariable("n2") int number2){
        Gretting greeting = new Gretting(number1, number2);
        return greeting.getGretting();
    }
}

