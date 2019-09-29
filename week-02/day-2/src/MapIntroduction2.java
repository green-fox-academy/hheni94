import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
  public static void main(String[] args) {

    //Create a map where the keys are strings and the values are strings with the following initial values
    HashMap<String, String> map2 = new HashMap<>();
    map2.put("978-1-60309-452-8", "A Letter to Jo");
    map2.put("978-1-60309-459-7", "Lupus");
    map2.put("978-1-60309-444-3", "Red Panda and Moon Bear");
    map2.put("978-1-60309-461-0", "The Lab");
    //Print all the key-value pairs in the following format
    //A Letter to Jo (ISBN: 978-1-60309-452-8)
    //Lupus (ISBN: 978-1-60309-459-7)
    //Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
    //The Lab (ISBN: 978-1-60309-461-0)
    for (Map.Entry<String, String> obj : map2.entrySet()) {
      System.out.println(obj.getValue() + " (ISBN: " + obj.getKey() + ")");
    }
    //Remove the key-value pair with key 978-1-60309-444-3
    map2.remove("978-1-60309-444-3");
    //Remove the key-value pair with value The Lab
    map2.values().remove("The Lab");
    //Add the following key-value pairs to the map
    map2.put("978-1-60309-450-4", "They Called Us Enemy");
    map2.put("978-1-60309-453-5", "Why Did We Trust Him?");
    //Print whether there is an associated value with key 478-0-61159-424-8 or not
    System.out.println("Is there a value with key 478-0-61159-424-8? " + map2.containsKey("478-0-61159-424-8"));
    //Print the value associated with key 978-1-60309-453-5
    System.out.println("The value of key 978-1-60309-453-5 is: " + map2.get("978-1-60309-453-5"));
  }
}
