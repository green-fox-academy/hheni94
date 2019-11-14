package com.hheni94.newprogrammerfoxclub.services;

import com.hheni94.newprogrammerfoxclub.models.Fox;

import java.util.List;

public interface IMainService {
  void addFox(Fox fox);
  Fox findFox(String name);
  List<String> getTrickLibrary();
  boolean alreadyExist(Fox foxToCHeck);
}
