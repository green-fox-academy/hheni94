import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        System.out.println("Please type in an integer number!");
        Scanner scanner = new Scanner(System.in);

        boolean number = (scanner.nextInt() % 2 == 0 );
        if (number) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
    }
}
