package thegardenapplication;

public class Main {
  public static void main(String[] args) {
    Garden garden = new Garden();

    garden.printStatus();
    System.out.println();
    System.out.println("Watering with 40");
    garden.water(40);
    garden.printStatus();
    System.out.println();
    System.out.println("Watering with 70");
    garden.water(70);
    garden.printStatus();
  }
}
