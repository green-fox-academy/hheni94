import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {

  @Test
  public void letterCounter_WithWord() {
    CountLetters test = new CountLetters();
    HashMap result = test.countLetters("pingvin");
    HashMap<Character, Integer> expected = new HashMap<>();
    expected.put('p' , 1);
    expected.put('i' , 2);
    expected.put('n' , 2);
    expected.put('g' , 1);
    expected.put('v' , 1);
    assertEquals(expected , result);
  }
}