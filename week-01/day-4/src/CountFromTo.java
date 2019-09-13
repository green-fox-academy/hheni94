import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        System.out.println("Please type in a number!");
        Scanner number1 = new Scanner(System.in);
        int typednumber1 = number1.nextInt();
        System.out.println("Please type in another number!");
        Scanner number2 = new Scanner(System.in);
        int typednumber2 = number2.nextInt();

        if (typednumber2 <= typednumber1) {
            System.out.println("The second number should be bigger!");
        }
        else {
            for (int i= typednumber1; i < typednumber2; i++) {
                System.out.println(i);
            }
        }
    }
}

