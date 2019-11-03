import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise8 {
  public static void main(String[] args) {
    List<Character> characters = Arrays.asList('S', 't', 'r', 'e', 'a', 'm');

    Stream<Character> charactersToString = characters.stream();
    Stream<String> list = charactersToString.map(c -> c.toString());
    String string = list.collect(Collectors.joining());

    System.out.println(string);
  }
}

//Write a Stream Expression to concatenate a Character list to a string!
