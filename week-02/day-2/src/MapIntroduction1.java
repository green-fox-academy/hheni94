import java.util.HashMap;

public class MapIntroduction1 {
    public static void main(String[] args) {

        //Create an empty map where the keys are integers and the values are characters
        HashMap<Integer, Character> map  = new HashMap<>();
        //Print out whether the map is empty or not
        System.out.println("Is the map empty or not? " + map.isEmpty());
        //Add the following key-value pairs to the map
        map.put(97, 'a');
        map.put(98, 'b');
        map.put(99, 'c');
        map.put(65, 'A');
        map.put(66, 'B');
        map.put(67, 'C');
        //Print all the keys
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }
        //Print all the values
        for (Character values : map.values()) {
            System.out.println(values);
        }
        //Add value D with the key 68
        map.put(68, 'D');
        //Print how many key-value pairs are in the map
        System.out.println("There are " + map.size() + " pairs in the map.");
        //Print the value that is associated with key 99
        System.out.println("The key 99 belongs to the " + map.get(99) + " value.");
        //Remove the key-value pair where with key 97
        map.remove(97);
        //Print whether there is an associated value with key 100 or not
        if (map.containsKey(100)) {
            System.out.println("There is a value with the key 100.");
        } else {
            System.out.println("There is not a value with the key 100.");
        }
        //Remove all the key-value pairs
        map.clear();
    }
}
