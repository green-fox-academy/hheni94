import java.util.Scanner;

public class DrawSquare {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%%
    // %    %
    // %    %
    // %    %
    // %    %
    // %%%%%%
    //
    // The square should have as many lines as the number was

    System.out.println("Please type in a number! This will be the length of the square.");
    Scanner scanner = new Scanner(System.in);
    int typedNumber = scanner.nextInt();

    for (int i = 1; i <= typedNumber; i++) {
      if (i % typedNumber == 0 || i % typedNumber == 1) {
        for (int j = 1; j <= typedNumber; j++) {
          System.out.print("%");
        }
        System.out.println();
      } else {
        for (int j = 1; j <= typedNumber; j++) {
          if (j % typedNumber == 1) {
            System.out.print("%");
          } else if (j % typedNumber == 0) {
            System.out.println("%");
          } else {
            System.out.print(" ");
          }
        }
      }
    }
  }
}
