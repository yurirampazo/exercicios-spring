package com.springproject.exercicios.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
@CrossOrigin("*")
public class FirstController {

  //  @RequestMapping(method = RequestMethod.GET)
  @GetMapping
  public String ola() {
    return "Olá!";
  }

  @GetMapping(path = {"/ola-mundo", "saudacao"})
  public String olaMundo() {
    return "Olá Mundo!";
  }

  @PostMapping(path = "saudacao")
  public String olaSpringPost() {
    return "Olá Spring Boot (POST)!";
  }


}
