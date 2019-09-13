import java.util.Scanner;

public class PartyIndicator {
        public static void main(String[] args) {

            System.out.println("I will make a party. How many girls should I invite?");
            Scanner girls = new Scanner(System.in);
            int numberGirls = girls.nextInt();
            System.out.println("How many boys should I invite?");
            Scanner boys = new Scanner(System.in);
            int numberBoys = boys.nextInt();

            int number = (numberGirls + numberBoys);

            if ((numberGirls == numberBoys) && (number >= 20)) {
                System.out.println("The party is excellent!");
            }
            else if ((number >= 20) && (numberGirls != numberBoys)) {
                System.out.println("Quite cool party!");
            }
            else if (number < 20) {
                System.out.println("Average party...");
            }
            else if (numberGirls == 0) {
                System.out.println("Sausage party");
            }
        }
    }

