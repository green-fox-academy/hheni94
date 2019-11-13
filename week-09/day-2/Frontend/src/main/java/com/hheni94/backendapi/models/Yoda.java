package com.hheni94.backendapi.models;

public class Yoda {
  private String sith_text;

  public Yoda(String sith_text) {
    this.sith_text = sith_text;
  }

  public Yoda() {
  }

  public String getSith_text() {
    return sith_text;
  }

  public void setSith_text(String sith_text) {
    this.sith_text = sith_text;
  }
}
