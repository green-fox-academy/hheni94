package thegardenapplication;

public class Flower {
  private String color;
  private double currentWaterAmount;
  private double absorbPercent = 0.75;

  public Flower(String color, double currentWaterAmount) {
    this.color = color;
    this.currentWaterAmount = currentWaterAmount;
  }

  public String getColor() { //ALT + INSERT!!!
    return color;
  }

  public double getCurrentWaterAmount() {
    return currentWaterAmount;
  }

  public String needsWater() {
    if (currentWaterAmount < 5) {
      return "needs water";
    } else {
      return "doesn't need water";
    }
  }

  public void watering(int wateramount, int counter) {
    currentWaterAmount = currentWaterAmount + (absorbPercent * (wateramount / counter));
  }
}
