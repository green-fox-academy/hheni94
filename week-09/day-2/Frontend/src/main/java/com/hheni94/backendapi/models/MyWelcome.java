package com.hheni94.backendapi.models;

public class MyWelcome {
  private String welcome_message;

  public MyWelcome(String welcome_message) {
    this.welcome_message = welcome_message;
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
