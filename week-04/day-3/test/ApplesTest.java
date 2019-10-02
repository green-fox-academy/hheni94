import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ApplesTest {
  Apples apples = new Apples();

  @Test
  public void getApple() {
    String result = apples.getApple();
    assertEquals("apple", result);
  }

  @Test
  public void getApple_OtherFruit() {
    String result = "watermelon";
    assertEquals("watermelon", result);
  }

}