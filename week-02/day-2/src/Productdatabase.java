import java.util.HashMap;
import java.util.Map;

public class Productdatabase {
  public static void main(String[] args) {

    //Create a map with the following key-value pairs.
    HashMap<String, Integer> products = new HashMap<>();
    products.put("Eggs", 200);
    products.put("Milk", 200);
    products.put("Fish", 400);
    products.put("Apples", 150);
    products.put("Bread", 50);
    products.put("Chicken", 550);
    //Create an application which solves the following problems.
    //
    //How much is the fish?
    System.out.println("The fish costs: " + products.get("Fish"));
    //What is the most expensive product?
    int mostExpensive = 0;
    String mostProduct = "";
    for (Map.Entry<String, Integer> obj : products.entrySet()) {
      if (obj.getValue() > mostExpensive) {
        mostExpensive = obj.getValue();
        mostProduct = obj.getKey();
      }
    }
    System.out.println("The most expensive product is: " + mostProduct);

    //What is the average price?
    int sum = 0;
    for (Map.Entry<String, Integer> obj : products.entrySet()) {
      sum += obj.getValue();
    }
    System.out.println("The average price is: " + (sum / products.size()));

    //How many products' price is below 300?
    int counter = 0;
    for (Map.Entry<String, Integer> obj : products.entrySet()) {
      if (obj.getValue() < 300) {
        counter++;
      }
    }
    System.out.println("There are " + counter + " products, whose price is below 300.");

    //Is there anything we can buy for exactly 125?
    if (products.containsValue(125)) {
      System.out.println("There is something we can buy for exactly 125.");
    } else {
      System.out.println("There is nothing we can buy for exactly 125.");
    }

    //What is the cheapest product?
    int cheapest = mostExpensive;
    String cheap = "";
    for (Map.Entry<String, Integer> obj : products.entrySet()) {
      if (obj.getValue() < cheapest) {
        cheapest = obj.getValue();
        cheap = obj.getKey();
      }
    }
    System.out.println("The cheapest product is: " + cheap);
  }
}
