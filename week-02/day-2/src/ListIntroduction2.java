import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction2 {
  public static void main(String[] args) {
    //Create a list ('List A') which contains the following values
    //Apple, Avocado, Blueberries, Durian, Lychee
    ArrayList<String> listA = new ArrayList<>();
    listA.add("Apple");
    listA.add("Avocado");
    listA.add("Blueberries");
    listA.add("Durian");
    listA.add("Lychee");
    //Create a new list ('List B') with the values of List A
    ArrayList<String> listB = new ArrayList<>(listA);
    //Print out whether List A contains Durian or not
    if (listA.contains("Durian")) {
      System.out.println("ListA contains Durian.");
    } else {
      System.out.println("ListA doesn't contain Durian.");
    }
    //Remove Durian from List B
    listB.remove("Durian");
    //Add Kiwifruit to List A after the 4th element
    listA.add(4, "Kiwifruit");
    //for (int i = 0; i < listA.size(); i++) {
    //  System.out.println(listA.get(i));
    //}
    //Compare the size of List A and List B
    if (listA.size() > listB.size()) {
      System.out.println("ListA is bigger.");
    } else {
      System.out.println("ListB is bigger.");
    }
    //Get the index of Avocado from List A
    System.out.println("The index of Avocado in ListA is: " + listA.indexOf("Avocado"));
    //Get the index of Durian from List B
    System.out.println("The index of Durian in ListB is: " + listB.indexOf("Durian"));
    //Add Passion Fruit and Pomelo to List B in a single statement
    String[] newElements = new String[] {"Passion Fruit", "Pomelo"};
    listB.addAll(Arrays.asList(newElements));
    //Print out the 3rd element from List A
    System.out.println("The 3rd element in ListA is: " + listA.get(2));
  }
}
