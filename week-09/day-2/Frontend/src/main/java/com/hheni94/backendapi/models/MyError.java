package com.hheni94.backendapi.models;

public class MyError {
  private String error;

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
