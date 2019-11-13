package com.hheni94.backendapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class SithServiceImp implements ISithService {

  @Override
  public String reverseSentence(String originalText) {
    String[] addedThings = {"Err..err.err.", "Uhmm.", "Arrgh."};
    String reversedText = "";
    Random random = new Random();

    String[] sentences = originalText.toLowerCase().split("\\. ");
    String[] modifiedSentences = new String[sentences.length];
    for (int i = 0; i < sentences.length; i++) {
      String[] words = sentences[i].split(" ");
      String[] changedWords = new String[words.length];
      String temp = "";
      if (words.length % 2 == 0) {
        for (int j = 0; j < words.length; j++) {
          if (j % 2 != 0) {
            changedWords[j] = words[j - 1];
          } else {
            changedWords[j] = words[j + 1];
          }
        }
      } else {
        for (int j = 0; j < words.length - 1; j++) {
          if (j % 2 != 0) {
            changedWords[j] = words[j - 1];
          } else {
            changedWords[j] = words[j + 1];
          }
        }
        changedWords[words.length - 1] = words[words.length - 1];
      }
      for (String word : changedWords) {
        temp += word + " ";
      }
      modifiedSentences[i] = temp.substring(0, 1).toUpperCase() + temp.substring(1, temp.length() - 1) + " ";
    }
    for (String sentence : modifiedSentences) {
      reversedText += sentence + addedThings[random.nextInt(addedThings.length)];
    }
    return reversedText;
  }
}
