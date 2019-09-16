import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {

        System.out.println("Please type in how many numbers you want!");
        Scanner number = new Scanner(System.in);
        int numberOfInts = number.nextInt();
        int sum=0;
        double average;
        for(int i=0; i<numberOfInts;i++){
            System.out.println("Please enter a number!");
            int nextNumber = number.nextInt();
            sum = sum + nextNumber;
        }
        average = (double)sum/numberOfInts;
        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}
