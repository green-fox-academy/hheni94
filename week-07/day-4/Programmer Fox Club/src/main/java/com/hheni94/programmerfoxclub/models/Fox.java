package com.hheni94.programmerfoxclub.models;

import java.util.List;

public class Fox {
  private String name;
  private List<String> listOfTricks;
  private String food;
  private String drink;

  public Fox(String name, List<String> listOfTricks, String food, String drink) {
    this.name = name;
    this.listOfTricks = listOfTricks;
    this.food = food;
    this.drink = drink;
  }

  public Fox(String name) {
    this.name = name;
  }

  public Fox() {
  }

  public String getName() {
    return name;
  }

  public List<String> getListOfTricks() {
    return listOfTricks;
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setListOfTricks(List<String> listOfTricks) {
    this.listOfTricks = listOfTricks;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
