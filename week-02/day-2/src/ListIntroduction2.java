import java.util.ArrayList;

public class ListIntroduction2 {
  public static void main(String[] args) {
    //Create a list ('List A') which contains the following values
    // Apple, Avocado, Blueberries, Durian, Lychee
    ArrayList<String> ListA = new ArrayList<>();
    ListA.add("Apple");
    ListA.add("Avocado");
    ListA.add("Blueberries");
    ListA.add("Durian");
    ListA.add("Lychee");
    //Create a new list ('List B') with the values of List A
    ArrayList<String> ListB = new ArrayList<>(ListA);
    //Print out whether List A contains Durian or not
    if (ListA.contains("Durian")) {
      System.out.println("ListA contains Durian.");
    } else {
      System.out.println("ListA doesn't contain Durian.");
    }
    //Remove Durian from List B
    ListB.remove("Durian");
    //for (int i = 0; i < ListB.size(); i++) {
    //   System.out.println(ListB.get(i));
    //}
    //Add Kiwifruit to List A after the 4th element
    ListA.add(4, "Kiwifruit");
    //for (int i = 0; i < ListA.size(); i++) {
     // System.out.println(ListA.get(i));
    //}
    //Compare the size of List A and List B
    if (ListA.size() > ListB.size()) {
      System.out.println("ListA is bigger.");
    } else
      System.out.println("ListB is bigger.");
    //Get the index of Avocado from List A
    //ListA.indexOf("Avocado");
    System.out.println("The index of Avocado is: " + ListA.indexOf("Avocado"));
    //Get the index of Durian from List B
    //ListB.indexOf("Durian");
    System.out.println("The index of Durian is: " + ListB.indexOf("Durian"));
    //Add Passion Fruit and Pomelo to List B in a single statement

    //Print out the 3rd element from List A
    System.out.println(ListA.get(2));
  }
}
