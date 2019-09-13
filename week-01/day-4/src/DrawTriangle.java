import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {

        System.out.println("Please type in a number!");
        Scanner number = new Scanner(System.in);
        int typednumber = number.nextInt();

        for (int i = 1; i < typednumber; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("*");
            }
            System.out.println("*");
        }
    }
}


