package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class RESTGreetCounterApp {
  AtomicLong greetCount = new AtomicLong();

  @RequestMapping(value = "/greeting2")
  public Greeting greeting2(@RequestParam String name) {
    return new Greeting(greetCount.incrementAndGet(), "Hello ," + name + "!");
  }
}
