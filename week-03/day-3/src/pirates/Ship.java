package pirates;

import java.util.ArrayList;
import java.util.Random;

public class Ship {
  ArrayList<Pirate> crew = new ArrayList<>();
  Pirate captain;

  public Ship() {
  }

  public void fillShip() {
    this.captain = new Pirate("Captain Captain", 2, false, "captain", false);
    Random random = new Random();
    int numberOfPirates = random.nextInt(20) + 1;
    for (int i = 0; i < numberOfPirates; i++) {
      crew.add(new Pirate());
    }
  }

  public int numberOfAliveCrew() {
    int counter = 0;
    for (int i = 0; i < crew.size(); i++) {
      if (crew.get(i).isDead == false) {
        counter++;
      }
    }
    return counter;
  }

  public void shipStatus() {
    if (captain.isDead == false && captain.isPassedOut == false) {
      System.out.println("The captain is alive and not passed out.");
    } else if (captain.isDead == false && captain.isPassedOut == true) {
      System.out.println("The captain is alive and passed out.");
    } else {
      System.out.println("The captain is dead.");
    }
    System.out.println("The captain consumed " + captain.intoxicationLevel + " rums.");
    System.out.println("There are " + numberOfAliveCrew() + " pirates alive.");
  }

  public Boolean battle(Ship otherShip) {
    int scoreThisShip = this.numberOfAliveCrew() - this.captain.intoxicationLevel;
    int scoreOtherShip = otherShip.numberOfAliveCrew() - otherShip.captain.intoxicationLevel;
    if (scoreThisShip > scoreOtherShip) {
      System.out.println("This ship won.");
      otherShip.dying();
      this.party();
      System.out.println("They are having a party.");
      return true;
    } else {
      System.out.println("Other ship won.");
      this.dying();
      otherShip.party();
      System.out.println("The other ship has a party.");
      return false;
    }
  }

  public void dying() {
    Random random = new Random();
    int death = random.nextInt(numberOfAliveCrew());
    for (int i = 0; i < death; i++) {
      crew.get(i).die();
    }
  }

  public void party() {
    for (int i = 0; i < crew.size(); i++) {
      crew.get(i).drinkSomeRum();
    }
  }
}
