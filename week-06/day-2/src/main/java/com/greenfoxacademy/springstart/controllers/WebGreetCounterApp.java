package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class WebGreetCounterApp {
  AtomicLong loadCount = new AtomicLong();

  @RequestMapping(value = "/greeting4")
  public Greeting greeting4(@RequestParam String name) {
    return new Greeting(loadCount.incrementAndGet(), "Hello ," + name + "! This site was loaded " + loadCount.incrementAndGet() + " times since last server start.");
  }
}
