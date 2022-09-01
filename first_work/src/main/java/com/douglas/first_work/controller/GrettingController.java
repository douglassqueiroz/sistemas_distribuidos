package com.douglas.first_work.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.douglas.first_work.model.Gretting;

@RestController
@RequestMapping(value = "/")
public class GrettingController {
    
    
    @GetMapping("/{n1}/{n2}")
    public ResponseEntity<Double> soma(@PathVariable("n1")Double number1, @PathVariable("n2")double Number2){
        Gretting greeting = new Gretting();//Criando uma variável chamada "greeting" do tipo Gretting
        return ResponseEntity.ok(greeting.getGretting());
    }

}
