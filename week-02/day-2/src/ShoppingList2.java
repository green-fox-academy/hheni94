import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {
  public static void main(String[] args) {

    //Represent the following products with their prices
    HashMap<String, Double> productsPrice = new HashMap<>();
    productsPrice.put("Milk", 1.07);
    productsPrice.put("Rice", 1.59);
    productsPrice.put("Eggs", 3.14);
    productsPrice.put("Cheese", 12.60);
    productsPrice.put("Chicken Breasts", 9.40);
    productsPrice.put("Apples", 2.31);
    productsPrice.put("Tomato", 2.58);
    productsPrice.put("Potato", 1.75);
    productsPrice.put("Onion", 1.10);

    //Represent Bob's shopping list
    HashMap<String, Integer> bob = new HashMap<>();
    bob.put("Milk", 3);
    bob.put("Rice", 2);
    bob.put("Eggs", 2);
    bob.put("Cheese", 1);
    bob.put("Chicken Breasts", 4);
    bob.put("Apples", 1);
    bob.put("Tomato", 2);
    bob.put("Potato", 1);

    //Represent Alice's shopping list
    HashMap<String, Integer> alice = new HashMap<>();
    alice.put("Rice", 1);
    alice.put("Eggs", 5);
    alice.put("Chicken Breasts", 2);
    alice.put("Apples", 1);
    alice.put("Tomato", 10);

    //Create an application which solves the following problems.
    //
    //How much does Bob pay?
    double bobPay = 0;
    for (Map.Entry<String, Double> obj : productsPrice.entrySet()) {
      for (Map.Entry<String, Integer> obj2 : bob.entrySet()) {
        if (obj.getKey() == obj2.getKey()) {
          bobPay = bobPay + (obj2.getValue() * obj.getValue());
        }
      }
    }
    System.out.println("Bob pays: " + bobPay);

    //How much does Alice pay?
    double alicePay = 0;
    for (Map.Entry<String, Double> obj : productsPrice.entrySet()) {
      for (Map.Entry<String, Integer> obj2 : alice.entrySet()) {
        if (obj.getKey() == obj2.getKey()) {
          alicePay = alicePay + (obj.getValue() * obj2.getValue());
        }
      }
    }
    System.out.println("Alice pays: " + alicePay);

    //Who buys more Rice?
    if (bob.get("Rice") > alice.get("Rice")) {
      System.out.println("Bob buys more rice.");
    } else if (alice.get("Rice") > bob.get("Rice")) {
      System.out.println("Alice buys more rice.");
    } else {
      System.out.println("Alice and Bob buy the same amount from rice.");
    }

    //Who buys more Potato?
    if (alice.containsKey("Potato")) {
      if (bob.get("Potato") > alice.get("Potato")) {
        System.out.println("Bob buys more potato.");
      } else if (alice.get("Potato") > bob.get("Potato")) {
        System.out.println("Alice buys more potato.");
      } else {
        System.out.println("Alice and Bob buy the same amount from potato.");
      }
    } else {
      System.out.println("Alice did not buy potato. So Bob bought more.");
    }

    //Who buys more different products?
    if (bob.size() == alice.size()) {
      System.out.println("Bob and Alice bought the same amount of products.");
    } else if (bob.size() > alice.size()) {
      System.out.println("Bob bought more.");
    } else {
      System.out.println("Alice bought more.");
    }

    //Who buys more products? (piece)
    int bobAmount = 0;
    int aliceAmount = 0;
    for (Map.Entry<String, Integer> obj1 : bob.entrySet()) {
      bobAmount += obj1.getValue();
    }
    for (Map.Entry<String, Integer> obj2 : alice.entrySet()) {
      aliceAmount += obj2.getValue();
    }
    if (bobAmount == aliceAmount) {
      System.out.println("Bob and Alice bought the same amount of products.");
    } else if (bobAmount > aliceAmount) {
      System.out.println("Bob bought more products.");
    } else {
      System.out.println("Alice bought more products.");
    }
  }
}
