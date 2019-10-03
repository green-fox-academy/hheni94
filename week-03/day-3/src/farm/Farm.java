package farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

  List<Animal> animals = new ArrayList<>();
  int numberOfFreePlaces = 10;

  public Farm() {
  }

  public void breed() {
    if (numberOfFreePlaces > 0) {
      animals.add(new Animal());
      numberOfFreePlaces--;
    }
  }

  public void slaughter() {
    Animal animalToRemove = new Animal();
    for (int i = 0; i < animals.size(); i++) {
      if (animals.get(i).hunger < animalToRemove.hunger) {
        animalToRemove = animals.get(i);
      }
    }
    animals.remove(animalToRemove);
  }
}
