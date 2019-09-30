package thegardenapplication;

import java.util.ArrayList;

public class Garden {
  private ArrayList<Flower> flowers;
  private ArrayList<Tree> trees;

  public Garden() { //Először megcsináljuk, hogy milyen legyen a kert, mi legyen benne és mit tudjon csinálni. Utána ezt a kertet fogjuk a mainben megcsinálni.
    this.flowers = new ArrayList<>();
    this.trees = new ArrayList<>();
    Flower yellowFlower = new Flower("yellow", 1);
    flowers.add(yellowFlower);
    Flower blueFlower = new Flower("blue", 1);
    flowers.add(blueFlower);
    Tree purpleTree = new Tree("purple", 1);
    trees.add(purpleTree);
    Tree orangeTree = new Tree("orange", 1);
    trees.add(orangeTree);
  }

  public void printStatus() {
    for (Flower flower : flowers) {
      System.out.println("The " + flower.getColor() + " " + flower.getClass().getSimpleName() + " " + flower.needsWater());
    }
    for (Tree tree : trees) {
      System.out.println("The " + tree.getColor() + " " + tree.getClass().getSimpleName() + " " + tree.needsWater());
    }
  }

  public void water(int waterAmount) {
    int counter = 0;
    for (Flower flower : flowers) {
      if (flower.getCurrentWaterAmount() < 5) {
        counter++;
      }
    }
    for (Tree tree : trees) {
      if (tree.getCurrentWaterAmount() < 10) {
        counter++;
      }
    }
    for (Flower flower : flowers) {
      flower.watering(waterAmount, counter);
    }
    for (Tree tree : trees) {
      tree.watering(waterAmount, counter);
    }
  }
}