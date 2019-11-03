import java.util.Arrays;
import java.util.List;

public class Exercise4 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    double avarageValueOfOddNumbers = numbers.stream()
        .filter(n -> n % 2 != 0)
        .mapToInt(n -> n)
        .summaryStatistics()
        .getAverage();

    System.out.println(avarageValueOfOddNumbers);
  }
}

//Write a Stream Expression to get the average value of the odd numbers from the following list:
//
//List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
