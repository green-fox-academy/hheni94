package com.hellobeanworld.hellobeanworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {

  private Printer printer;

  @Autowired
  public HellobeanworldApplication(Printer printer) {
    this.printer = printer;
  }

  public static void main(String[] args) {
    SpringApplication.run(HellobeanworldApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("Kitartást! Lesz ez jobb vagy rosszabb is!");
  }
}

// # HelloBeanWorld application

// Create a Spring project.

// Use the Printer class as a base to let Spring create a dependency from it.
//@Service
//public class Printer {
// public void log(String message) {
//System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
//  }
//}

// - Implement the `CommandLineRunner` interface on your application
// - Autowire the `Printer` to your application
// - Use the `log` method

// The output should be similar to the following:
// ```
// SOME SPRING INFO
// 2018-01-09T16:17:25.323 MY PRINTER SAYS --- hello
// SOME SPRING INFO
// ```
