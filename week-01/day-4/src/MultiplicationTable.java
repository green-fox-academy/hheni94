import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        System.out.println("Please type in a number!");
        Scanner typedNumber = new Scanner(System.in);
        int number = typedNumber.nextInt();

        int b;

        for (int i = 1; i < 11; i++) {
            b = number * i;
            System.out.println(i + "*" + number + "=" + b);
        }
    }
}
