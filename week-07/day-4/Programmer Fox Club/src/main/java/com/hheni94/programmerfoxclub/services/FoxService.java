package com.hheni94.programmerfoxclub.services;

import com.hheni94.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoxService {
  private ArrayList<Fox> foxes;

  public FoxService() {
    foxes = new ArrayList<>();
  }

  public void addFoxes(String name) {
    foxes.add(new Fox(name));
  }

  public Fox getFoxByName(String name) {
    List<Fox> names = foxes.stream()
        .filter(f -> f.getName().equals(name))
        .collect(Collectors.toList());
    if(names.size() == 0) {
      return null;
    } else {
      return names.get(0);
    }
  }

  public boolean nameChecker(String name) {
    if (foxes.contains(getFoxByName(name))) {
      return true;
    } else {
      return false;
    }
  }

  public boolean emptyChecker() {
    if(foxes.size() == 0) {
      return true;
    } else {
      return false;
    }
  }
}
