import java.util.Scanner;

public class MileToKmConverter {

    public static void main(String[] args) {

        double distanceMiles = 1;
        double distanceKm = 1.609344;

        System.out.println("Please give a number which will be a distance in miles:");
        Scanner scanner = new Scanner(System.in);
        double askedNumber = (scanner.nextDouble() * distanceKm);
        System.out.println("The given miles is in km: " + askedNumber);
    }
}
