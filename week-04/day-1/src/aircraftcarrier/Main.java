package aircraftcarrier;

public class Main {
  public static void main(String[] args) {
    AircraftF16 oneF16 = new AircraftF16();

    System.out.println(oneF16.getStatus());
    oneF16.refill(100);
    System.out.println(oneF16.getStatus());
    oneF16.fight();
    System.out.println(oneF16.getStatus());
  }
}
