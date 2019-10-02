package pirates;

public class Main {
  public static void main(String[] args) {
    Pirate pirate1 = new Pirate("Jack Sparrow", 3, false, "captain", false);
    Pirate pirate2 = new Pirate("Blackbeard", 4, false, "", false);
    Pirate pirate3 = new Pirate("Barbossa", 2, false, "", false);
    Pirate pirate4 = new Pirate("William Kidd", 3, false, "", false);

    pirate1.addParrot();
    pirate1.howsItGoingMate();
    pirate1.drinkSomeRum();
    pirate1.howsItGoingMate();
    pirate1.drinkSomeRum();
    pirate1.howsItGoingMate();
    pirate1.drinkSomeRum();
    pirate1.howsItGoingMate();
    System.out.println();
    pirate2.addParrot();
    pirate2.die();
    pirate2.drinkSomeRum();
    System.out.println();
    pirate3.brawl(pirate4);

    Ship ship1 = new Ship();
    Ship ship2 = new Ship();

    ship1.fillShip();
    ship2.fillShip();
    ship1.shipStatus();
    ship2.shipStatus();
    System.out.println();
    ship1.battle(ship2);
    ship1.shipStatus();
    ship2.shipStatus();

  }
}
