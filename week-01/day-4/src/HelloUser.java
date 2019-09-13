import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {

            System.out.println("Please give the name of the user:");
            Scanner scanner = new Scanner(System.in);
            String askedName = scanner.nextLine();
            System.out.println(askedName);
            System.out.println("Hello: " + askedName);
    }
}
