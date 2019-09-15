import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        System.out.println("Please type in 5 integer numbers in a row!");
        Scanner number1 = new Scanner(System.in);
        int typedNumber1 = number1.nextInt();
        Scanner number2 = new Scanner(System.in);
        int typedNumber2 = number2.nextInt();
        Scanner number3 = new Scanner(System.in);
        int typedNumber3 = number3.nextInt();
        Scanner number4 = new Scanner(System.in);
        int typedNumber4 = number4.nextInt();
        Scanner number5 = new Scanner(System.in);
        int typedNumber5 = number5.nextInt();

        int sum = (typedNumber1 + typedNumber2 + typedNumber3 + typedNumber4 + typedNumber5);
        double average = (sum / 5);

        System.out.println("Sum: " + sum + " , Average: " + average);
    }
}
