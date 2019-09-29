import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
  public static void main(String[] args) {

    //Create a map with the following key-value pairs.
    HashMap<String, String> contacts = new HashMap<>();
    contacts.put("William A. Lathan", "405-709-1865");
    contacts.put("John K. Miller", "402-247-8568");
    contacts.put("Hortensia E. Foster", "606-481-6467");
    contacts.put("Amanda D. Newland", "319-243-5613");
    contacts.put("Brooke P. Askew", "307-687-2982");
    //Create an application which solves the following problems.
    //
    //What is John K. Miller's phone number?
    System.out.println("John K. Miller's phone number is: " + contacts.get("John K. Miller"));
    //Whose phone number is 307-687-2982?
    for (Map.Entry<String, String> obj : contacts.entrySet()) {
      if (obj.getValue().equals("307-687-2982")) {
        System.out.println("The phone number 307-687-2982 belongs to: " + obj.getKey());
      }
    }
    //Do we know Chris E. Myers' phone number?
    System.out.println("Do we know Chris E. Meyer's phone number? " + contacts.containsKey("Chris E. Meyer"));
  }
}
