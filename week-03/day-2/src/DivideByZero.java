import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
    // Create a function that takes a number NEM KELL SCANNER!!!
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0

    printDivisionResult(10);
  }

  public static void printDivisionResult (int input) { //Csak annyi a dolga, hogy megcsinálja és print-eljen.

    try {
      System.out.println(10 / input);
    } catch (ArithmeticException e) {
      System.out.println("Fail!");
    }
  }
}
