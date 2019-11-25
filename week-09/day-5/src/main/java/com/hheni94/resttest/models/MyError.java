package com.hheni94.resttest.models;

public class MyError {
  private String error = "I am Groot!";

  public MyError() {
  }

  public MyError(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
