import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        System.out.println("How many chicken does the farmer have? Please type in a number!");
        Scanner number1 = new Scanner(System.in);
        int chicken = number1.nextInt();
        System.out.println("How many pig does the farmer have? Please type in a number!");
        Scanner number2 = new Scanner(System.in);
        int pig = number2.nextInt();

        int animalLegs = (chicken*2) + (pig*4);

        System.out.println("All the animals at the farm have: " + animalLegs + " legs.");
    }
}
