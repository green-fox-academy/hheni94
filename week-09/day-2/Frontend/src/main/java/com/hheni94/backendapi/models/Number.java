package com.hheni94.backendapi.models;

public class Number {
  private int received;
  private int result;

  public Number(int received) {
    this.received = received;
    this.result = received * 2;
  }

  public Number() {
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
