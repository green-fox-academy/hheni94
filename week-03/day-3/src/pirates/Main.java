package pirates;

public class Main {
  public static void main(String[] args) {
    Pirate pirate1 = new Pirate("Jack Sparrow" , 3, false , "captain" , false);
    Pirate pirate2 = new Pirate("Blackbeard" , 4, false, "" , false);

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

  }
}
