import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //        //        //
        //        //        //
        //        //        //    *
        //        //        //   ***
        //        //        //  *****
        //        //        // *******
        //        //        //
        //        //        // The pyramid should have as many lines as the number was

        System.out.println("Please type in a number! This will be the height of the pyramid.");
        Scanner scanner = new Scanner(System.in);
        int typedNUmber = scanner.nextInt();

        int height = typedNUmber;

        for (int p = 1; p <= height; p++) { //p itt a piramis szintjeit jelöli
            for (int space = 1; space <= height-p; space++) {
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
