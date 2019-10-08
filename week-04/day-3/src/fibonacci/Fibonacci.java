package fibonacci;

public class Fibonacci {
  public int computeFibonacci(int index) {
    int basic = 0;
    int fibonacciNumber = 1;
    for (int i = 0; i < index; i++) {
      fibonacciNumber += basic;
      basic = fibonacciNumber - basic;
    }
    return fibonacciNumber;
  }
}
