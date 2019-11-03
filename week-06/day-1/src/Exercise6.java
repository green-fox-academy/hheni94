import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {
  public static void main(String[] args) {
    String string = "UpPeRcAsE";

    List<Character> uppercaseCharactersInAString = string.codePoints()
        .mapToObj(c -> (char) c)
        .filter(Character::isUpperCase)
        .collect(Collectors.toList());

    System.out.println(uppercaseCharactersInAString);
  }
}

//Write a Stream Expression to find the uppercase characters in a string!
