package fibonacci;

public class Main {
  public static void main(String[] args) {
    Fibonacci fibonacci = new Fibonacci();

    System.out.println(fibonacci.computeFibonacci(5));

    for (int i = 0; i < 5; i++) {
      System.out.print(fibonacci.computeFibonacci(i) + ",");
    }
  }
}
