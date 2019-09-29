import java.util.HashMap;
import java.util.Map;

public class ProductDatabase2 {
  public static void main(String[] args) {

    //Create a map with the following key-value pairs.
    HashMap<String, Integer> product = new HashMap<>();
    product.put("Eggs", 200);
    product.put("Milk", 200);
    product.put("Fish", 400);
    product.put("Apples", 150);
    product.put("Bread", 50);
    product.put("Chicken", 550);
    //Create an application which solves the following problems.
    //
    //Which products cost less than 201? (just the name)
    for (Map.Entry<String, Integer> obj : product.entrySet()) {
      if (obj.getValue() < 201) {
        System.out.print(obj.getKey() + ", ");
      }
    }
    System.out.println();
    //Which products cost more than 150? (name + price)
    for (Map.Entry<String, Integer> obj : product.entrySet()) {
      if (obj.getValue() > 150) {
        System.out.print(obj.getKey() + ": " + obj.getValue() + ", ");
      }
    }
  }
}
