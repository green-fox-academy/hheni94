package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloUserRESTApp {
  @RequestMapping(value = "/greeting1")
  public Greeting greeting1(@RequestParam String name) {
    return new Greeting(1, " Hello " + name + "!");
  }
}