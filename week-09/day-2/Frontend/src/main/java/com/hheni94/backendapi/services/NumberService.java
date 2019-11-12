package com.hheni94.backendapi.services;

import com.hheni94.backendapi.models.Number;
import com.hheni94.backendapi.repositories.NumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NumberService {

  private NumberRepository numberRepository;

  @Autowired
  public NumberService(NumberRepository numberRepository) {
    this.numberRepository = numberRepository;
  }

  public List<Number> getAllNumbers() {
    return numberRepository.getAllNumbers();
  }

//  public Number getDoubledNumber(int inputNumber) {
//    Number newNumber = new Number(inputNumber);
//    numberRepository.addNumber(newNumber);
//    numberRepository.getNumber(inputNumber).setResult(inputNumber * 2);
//    return newNumber;
//  }
}
