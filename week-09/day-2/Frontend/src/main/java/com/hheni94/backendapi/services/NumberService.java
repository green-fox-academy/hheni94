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

  public int sum(int number) {
    int result = 0;
    for (int i = 0; i < number + 1; i++) {
      result += i;
    }
    return result;
  }

  public int factor(int number) {
    int result = 1;
    for (int i = 1; i < number + 1; i++) {
      result *= i;
    }
    return result;
  }

  public int sumArray(int[] inputNumbers) {
    int result = 0;
    for (int i = 0; i < inputNumbers.length; i++) {
      result += inputNumbers[i];
    }
    return result;
  }

  public int multiplyArray(int[] inputNumbers) {
    int result = 1;
    for (int i = 0; i < inputNumbers.length; i++) {
      result *= inputNumbers[i];
    }
    return result;
  }
  
  public int[] doubleArray(int[] inputNumbers) {
    int[] result = new int[inputNumbers.length];
    for (int i = 0; i < inputNumbers.length; i++) {
      result[i] = inputNumbers[i] * 2;
    }
    return result;
  }
//  public Number getDoubledNumber(int inputNumber) {
//    Number newNumber = new Number(inputNumber);
//    numberRepository.addNumber(newNumber);
//    numberRepository.getNumber(inputNumber).setResult(inputNumber * 2);
//    return newNumber;
//  }
}
