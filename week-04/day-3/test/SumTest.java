import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {
  Sum sum = new Sum();

  @Test
  public void sumOfTheElements_MultipleElements() {
    ArrayList<Integer> test = new ArrayList<>(Arrays.asList(4, 6, 22));
    int result = sum.sumOfTheElements(test);
    assertEquals(32, result);
  }

  @Test
  public void sumOfTheElements_EmptyList() {
    ArrayList<Integer> test = new ArrayList<>();
    int result = sum.sumOfTheElements(test);
    assertEquals(0, result);
  }

  @Test
  public void sumOfTheElements_OneElement() {
    ArrayList<Integer> test = new ArrayList<>(Arrays.asList(4));
    int result = sum.sumOfTheElements(test);
    assertEquals(4, result);
  }

  @Test
  public void sumOfTheElements_WithNull() {
    ArrayList<Integer> test = new ArrayList<>();
    Integer result = null;
    assertEquals(null, result);
  }

}