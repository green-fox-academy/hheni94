package com.bankofsimba.bankofsimba.models;

public class BankAccount {
  private String name;
  private int balance;
  private String animalType;
  private boolean isKing;
  private boolean ownerIsGoodGuy;

  public BankAccount(String name, int balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public BankAccount(String name, int balance, String animalType, boolean isKing, boolean ownerIsGoodGuy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.ownerIsGoodGuy = ownerIsGoodGuy;
  }

  public BankAccount() {
  }

  public String getName() {
    return name;
  }

  public int getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean isKing() {
    return isKing;
  }

  public void setKing(boolean king) {
    isKing = king;
  }

  public boolean isOwnerIsGoodGuy() {
    return ownerIsGoodGuy;
  }

  public void setOwnerIsGoodGuy(boolean ownerIsGoodGuy) {
    this.ownerIsGoodGuy = ownerIsGoodGuy;
  }
}
