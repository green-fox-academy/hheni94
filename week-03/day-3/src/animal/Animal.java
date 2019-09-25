package animal;

public class Animal {
  int hunger = 50;
  int thirst = 50;

  /*public Animal(int hunger, int thirst) {
    this.hunger = hunger;
    this.thirst = thirst;
  }*/

  public void eat() {
    hunger -= 1;
  }

  public void drink() {
    thirst -= 1;
  }

  public void play() {
    hunger += 1;
    thirst += 1;
  }
}
