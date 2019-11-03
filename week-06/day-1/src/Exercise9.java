import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise9 {
  public static void main(String[] args) {
    String string = "character";

    Stream<Character> stringToCharacters = string.codePoints().mapToObj(c -> (char) c);
    Map<Object, Long> frequencyOfCaracters = stringToCharacters.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

    System.out.println(frequencyOfCaracters);
  }
}

//Write a Stream Expression to find the frequency of characters in a given string!
