import java.util.HashMap;

public class CountLetters {

  public HashMap countLetters(String word) {
    char[] arrayOfWord = word.toCharArray();
    HashMap<Character, Integer> mapOfWord = new HashMap<>();

    for (int i = 0; i < arrayOfWord.length; i++) {
      if (mapOfWord.containsKey(arrayOfWord[i])) {
        mapOfWord.put(arrayOfWord[i], mapOfWord.get(arrayOfWord[i]) + 1);
      } else {
        mapOfWord.put(arrayOfWord[i], 1);
      }
    }
    return mapOfWord;
  }
}
