package pirates;

public class Pirate {
  String name;
  int intoxicationLevel;
  boolean isPassedOut;
  String rank;
  boolean isDead;

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
    } else if (isDead == false){
      System.out.println(name + " is passed out, leave him alone!");
    } else {
      System.out.println("He's dead.");
    }
  }

  public void howsItGoingMate() {
    if (isPassedOut == false && intoxicationLevel <= 4 && isDead == false) {
      System.out.println("Pour me anudder!");
    } else if (isPassedOut == false && intoxicationLevel > 4 && isDead == false){
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      isPassedOut = true;
    } else if (isPassedOut == true && isDead == false){
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
}
