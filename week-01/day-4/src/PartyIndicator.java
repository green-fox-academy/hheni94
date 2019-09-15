import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        System.out.println("I will make a party. How many girls should I invite?");
        Scanner scanner = new Scanner(System.in);
        int girls = scanner.nextInt();
        System.out.println("How many boys should I invite?");
        int boys = scanner.nextInt();

        int guests = girls + boys;

        if ((girls == boys) && (guests >= 20)) {
            System.out.println("The party is excellent!");
        }
        else if ((guests >= 20) && (girls != boys)) {
            System.out.println("Quite cool party");
        }
        else if (girls == 0) {
            System.out.println("Sausage party");
        }
        else if (guests <20) {
            System.out.println("Average party...");
        }
    }
}


