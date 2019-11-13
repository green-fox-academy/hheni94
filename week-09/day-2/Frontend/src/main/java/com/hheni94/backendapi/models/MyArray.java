package com.hheni94.backendapi.models;

public class MyArray {
  private String what;
  private int[] numbers;

  public MyArray(String what, int[] numbers) {
    this.what = what;
    this.numbers = numbers;
  }

  public MyArray() {
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }
}
