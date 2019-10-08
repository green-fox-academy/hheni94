package fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
  @Test
  public void computeFibonacciNumber() {
    Fibonacci test = new Fibonacci();
    int result = test.computeFibonacci(5);
    assertEquals(8, result);
  }
}