import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShoppingList {
  public static void main(String[] args) {

    //Create a list with the following items.
    //Eggs, milk, fish, apples, bread and chicken
    ArrayList<String> shoppingList = new ArrayList<>();
    shoppingList.add("eggs");
    shoppingList.add("milk");
    shoppingList.add("fish");
    shoppingList.add("apples");
    shoppingList.add("bread");
    shoppingList.add("chicken");
    //Create an application which solves the following problems.
    //Do we have milk on the list?
    //Do we have bananas on the list?
    if (shoppingList.contains("milk") && shoppingList.contains("bananas")) {
      System.out.println("The shopping list contains milk and bananas too.");
    } else if (shoppingList.contains("milk")) {
      System.out.println("The shopping list contains milk.");
    } else if (shoppingList.contains("bananas")) {
      System.out.println("The shopping list contains bananas.");
    } else {
      System.out.println("The shopping list does not contain milk and banana.");
    }


  }
}
