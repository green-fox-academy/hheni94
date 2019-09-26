package petrolstation;

public class Main {
  public static void main(String[] args) {
    Station station = new Station();
    Car volvo = new Car();

    station.refill(volvo);
    System.out.println(station.gasAmount);
    System.out.println(volvo.gasAmount);
  }
}
