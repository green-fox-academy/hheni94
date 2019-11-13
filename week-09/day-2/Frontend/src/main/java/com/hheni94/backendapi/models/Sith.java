package com.hheni94.backendapi.models;

public class Sith {
  private String text;

  public Sith(String text) {
    this.text = text;
  }

  public Sith() {
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
