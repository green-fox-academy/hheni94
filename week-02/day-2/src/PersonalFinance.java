import java.util.ArrayList;

public class PersonalFinance {
  public static void main(String[] args) {

    //Create a list with the following items.
    //500, 1000, 1250, 175, 800 and 120
    ArrayList<Integer> expenses = new ArrayList<>();
    expenses.add(500);
    expenses.add(1000);
    expenses.add(1250);
    expenses.add(175);
    expenses.add(800);
    expenses.add(120);
    //Create an application which solves the following problems.
    //How much did we spend?
    int sum = 0;
    for (int i = 0; i < expenses.size(); i++) {
      sum = sum + expenses.get(i);
    }
    System.out.println("We spent: " + sum);

    //Which was our greatest expense?
    int greatest = 0;
    for (int i = 0; i < expenses.size(); i++) {
      if (expenses.get(i) > greatest) {
        greatest = expenses.get(i);
      }
    }
    System.out.println("Our greatest expense was: " + greatest);


    //Which was our cheapest spending?
    int cheapest = greatest;
    for (int i = 0; i < expenses.size(); i++) {
      if (expenses.get(i) < greatest) {
        cheapest = expenses.get(i);
      }
    }
    System.out.println("Our cheapest spending was: " + cheapest);

    //What was the average amount of our spendings?
    int average = sum / expenses.size();
    System.out.println("The average amount of our spendings was: " + average);
  }
}
