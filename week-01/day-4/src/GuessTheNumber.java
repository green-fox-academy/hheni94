import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int number = 4;

        System.out.println("Please guess a number!");
        Scanner num = new Scanner(System.in);


        while (true) {
            int guessedNumber = num.nextInt();
            if (guessedNumber == number) {
                System.out.println("You found the number: " + number);
                break;
            }
            else if (guessedNumber < number) {
                System.out.println("The stored number is higher. Please guess a new number! ");
            }
            else {
                System.out.println("The stored number is lower. Please guess a new number! ");
            }
        }
    }
}
