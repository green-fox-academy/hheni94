import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);

    List<Integer> squaredValueOfNumberIsMoreThan20 = numbers.stream()
        .filter(n -> (n * n) > 20)
        .collect(Collectors.toList());

    System.out.println(squaredValueOfNumberIsMoreThan20);
  }
}

//Write a Stream Expression to find which number squared value is more then 20 from the following list:
//
//List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
