package thegardenapplication;

public class Tree {
  private String color;
  private double currentWaterAmount;
  private double absorbPercent = 0.4;

  public Tree(String color, double currentWaterAmount) {
    this.color = color;
    this.currentWaterAmount = currentWaterAmount;
  }

  public String getColor() {
    return color;
  }

  public double getCurrentWaterAmount() {
    return currentWaterAmount;
  }

  public String needsWater() {
    if (currentWaterAmount < 10) {
      return "needs water";
    } else {
      return "doesn't need water";
    }
  }

  public void watering(int wateramount, int counter) {
    currentWaterAmount = currentWaterAmount + (absorbPercent * (wateramount / counter));
  }
}
