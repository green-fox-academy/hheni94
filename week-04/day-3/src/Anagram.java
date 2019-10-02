import java.util.Arrays;

public class Anagram {

  public Boolean anagramChecker(String wordOne, String wordTwo) {
    boolean anagram = false;
    if (wordOne.length() != wordTwo.length()) {
      //System.out.println("They can't be anagrams.");
      return anagram;
    } else {
      char[] ArrayOne = wordOne.toCharArray(); //Fogja az összes karaktert és belerakja egy tömbbe.
      char[] ArrayTwo = wordTwo.toCharArray();
      Arrays.sort(ArrayOne);
      Arrays.sort(ArrayTwo);

      int counter = 0;
      for (int i = 0; i < ArrayOne.length; i++) {
        if (ArrayOne[i] == ArrayTwo[i]) {
          counter++;
          //System.out.println("They are anagrams.");
        }
      }
      if (counter == ArrayOne.length) {
        anagram = true;
      }
      return anagram;
      }
    }
  }
