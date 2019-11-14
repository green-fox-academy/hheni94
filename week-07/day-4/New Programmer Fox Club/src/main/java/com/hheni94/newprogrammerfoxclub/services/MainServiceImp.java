package com.hheni94.newprogrammerfoxclub.services;

import com.hheni94.newprogrammerfoxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MainServiceImp implements IMainService {
  private Fox defaultFox = new Fox();
  private List<Fox> foxes = new ArrayList<>();
  private List<String> trickLibrary = new ArrayList<>(Arrays.asList("Learn JAVA basics", "Learn SQL", "Learn to write a function", "Learn to present your code", "Learn REST"));

  @Override
  public void addFox(Fox fox) {
    foxes.add(fox);
  }

  @Override
  public Fox findFox(String name) {
    Fox result = defaultFox;
    for (Fox fox : foxes) {
      if (fox.getName().equals(name)) {
        result = fox;
      }
    }
    return result;
  }

  @Override
  public List<String> getTrickLibrary() {
    return trickLibrary;
  }

  @Override
  public boolean alreadyExist(Fox foxToCHeck) {
    boolean exist = false;
    for (Fox fox : foxes) {
      if (fox.getName().equals(foxToCHeck.getName())) {
        exist = true;
      }
    }
    return exist;
  }
}
