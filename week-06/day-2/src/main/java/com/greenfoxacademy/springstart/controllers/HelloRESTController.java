package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  //Hello World REST App
  @RequestMapping(value = "/greeting")
  public Greeting greeting() {
    Greeting greeting = new Greeting(1, "Hello, World!");
    return greeting;
  }
}
