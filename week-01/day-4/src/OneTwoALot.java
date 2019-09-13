import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {

        System.out.println("Please type in a number!");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Not enough");
        }
        else if (number == 1) {
            System.out.println("One");
        }
        else if (number == 2) {
            System.out.println("Two");
        }
        else if (number > 2) {
            System.out.println("A lot");
        }
    }
}

