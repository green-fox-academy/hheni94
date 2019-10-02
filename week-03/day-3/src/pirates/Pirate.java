package pirates;

import java.util.Random;

public class Pirate {
  String name;
  int intoxicationLevel;
  boolean isPassedOut;
  String rank;
  boolean isDead;

  public Pirate() {
  }

  public Pirate(String name, int intoxicationLevel, boolean isPassedOut, String rank, boolean isDead) {
    this.name = name;
    this.intoxicationLevel = intoxicationLevel;
    this.isPassedOut = isPassedOut;
    this.rank = rank;
    this.isDead = isDead;
  }

  public void drinkSomeRum() {
    if (isPassedOut == false && isDead == false) {
      intoxicationLevel++;
    } else if (isDead == false) {
      System.out.println(name + " is passed out, leave him alone!");
    } else {
      System.out.println("He's dead.");
    }
  }

  public void howsItGoingMate() {
    if (isPassedOut == false && intoxicationLevel <= 4 && isDead == false) {
      System.out.println("Pour me anudder!");
    } else if (isPassedOut == false && intoxicationLevel > 4 && isDead == false) {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      isPassedOut = true;
    } else if (isPassedOut == true && isDead == false) {
      System.out.println(name + " is passed out, go away!");
    } else {
      System.out.println("He's dead.");
    }
  }

  public void die() {
    isDead = true;
  }

  public void addParrot() {
    if (rank.equals("captain")) {
      System.out.println("I'm captain " + name + ", that's why I got a parrot.");
    } else {
      System.out.println("I'm just a drunken sailor. I have just rum.");
    }
  }

  public void brawl(Pirate otherPirate) {
    if ((this.isDead == false) && (otherPirate.isDead == false)) {
      Random random = new Random();
      int outcome = random.nextInt(3);
      if (outcome == 1) {
        this.die();
        System.out.println(this.name + " died.");
      } else if (outcome == 2) {
        otherPirate.die();
        System.out.println(otherPirate.name + " died.");
      } else {
        this.isPassedOut = true;
        otherPirate.isPassedOut = true;
        System.out.println("Both pirates are passed out.");
      }
    }
  }
}
