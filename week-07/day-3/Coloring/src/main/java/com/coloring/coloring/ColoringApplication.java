package com.coloring.coloring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColoringApplication implements CommandLineRunner { //ALT+ENTER = implement method

  private BlueColor blue;

  @Autowired
  public ColoringApplication(BlueColor blue) {
    this.blue = blue;
  }

  public static void main(String[] args) {
    SpringApplication.run(ColoringApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    blue.printColor();
  }
}
