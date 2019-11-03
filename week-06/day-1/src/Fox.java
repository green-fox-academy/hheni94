import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Fox {
  //Exercise 10
  String name;
  String color;
  int age;

  public Fox(String name, String color, int age) {
    this.name = name;
    this.color = color;
    this.age = age;
  }

  public static void main(String[] args) {
    List<Fox> foxes = new ArrayList<>();
    foxes.add(new Fox("Péter", "orange", 6));
    foxes.add(new Fox("Sándor", "green", 4));
    foxes.add(new Fox("Elemér", "green", 10));
    foxes.add(new Fox("Boldizsár", "black", 3));
    foxes.add(new Fox("Tihamér", "white", 1));

    List<String> greenFoxes = foxes.stream()
        .filter(f -> f.color.equals("green"))
        .map(f -> f.name)
        .collect(Collectors.toList());

    System.out.println("Fox/foxes with green color " + greenFoxes);

    List<String> greenFoxesLessThan5Years = foxes.stream()
        .filter(f -> (f.color.equals("green")) && (f.age < 5))
        .map(f -> f.name)
        .collect(Collectors.toList());

    System.out.println("Fox/foxes with green color and age under 5 years " + greenFoxesLessThan5Years);

    Map<Object, Long> frequencyByColor = foxes.stream()
        .collect(Collectors.groupingBy(f -> f.color, Collectors.counting()));

    System.out.println(frequencyByColor);
  }
}

//Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:
//
//Write a Stream Expression to find the foxes with green color!
//Write a Stream Expression to find the foxes with green color, and age less then 5 years!
//Write a Stream Expression to find the frequency of foxes by color!
