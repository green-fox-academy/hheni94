import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        System.out.println("Please type in 2 numbers in a row!");
        Scanner number1 = new Scanner(System.in);
        int typedNumber1 = number1.nextInt();
        Scanner number2 = new Scanner(System.in);
        int typedNumber2 = number2.nextInt();

        if (typedNumber1 > typedNumber2) {
            System.out.println(typedNumber1);
        }
        else {
            System.out.println(typedNumber2);
        }
    }
}
