package com.hheni94.backendapi.repositories;

import com.hheni94.backendapi.models.Number;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class NumberRepository {
  private List<Number> numbers;

  public NumberRepository() {
    numbers = new ArrayList<>();
    numbers.add(new Number(15));
  }

  public List<Number> getAllNumbers() {
    return numbers;
  }

  public void addNumber(Number number) {
    numbers.add(number);
  }

  public Number getNumber(int input) {
    List<Number> items = numbers.stream()
        .filter(i -> i.getReceived() == input)
        .collect(Collectors.toList());
    if (items.size() > 0) {
      return items.get(0);
    } else {
      return null;
    }
  }
}
