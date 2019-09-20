import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        System.out.println("Please type in a number! This will be the height of the diamond.");
        Scanner scanner = new Scanner(System.in);
        int typedNUmber = scanner.nextInt();

        int height = typedNUmber;

        for (int p = 1; p <= height/2; p++) {
            for (int space = 1; space <= height/2-p; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= p*2-1; star++) {
                System.out.print("*");
            }
            for (int space = 1; space <= height-p; space++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int p = height/2; p >= 1; p--) {
            for (int space = 1; space <= height/2-p; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= p*2-1; star++) {
                System.out.print("*");
            }
            for (int space = 1; space <= height-p; space++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

