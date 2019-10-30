package com.coloring.coloring;

import org.springframework.stereotype.Service;

@Service
public class Printer {

  public void log(String message) {
    System.out.println("My printer says: " + message);
  }
}
