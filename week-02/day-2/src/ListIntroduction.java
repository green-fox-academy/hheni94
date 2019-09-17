import java.util.ArrayList;

public class ListIntroduction {
    public static void main(String[] args) {

        //Create an empty list which will contain names (strings)
        ArrayList<String> names = new ArrayList<>();
        //Print out the number of elements in the list
        System.out.println(names.size()); //Ha a tömb méretét szeretném megtudni, hogy hány eleme van = size!
        //Add William to the list
        names.add("William");
        //Print out whether the list is empty or not
        System.out.println("Is the list empty or not? " + names.isEmpty());
        //Add John to the list
        names.add("John");
        //Add Amanda to the list
        names.add("Amanda");
        //Print out the number of elements in the list
        System.out.println(names.size());
        //Print out the 3rd element
        System.out.println(names.get(2));
        /*Iterate through the list and print out each name
            William
            John
            Amanda*/
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        /*//Iterate through the list and print
            1. William
            2. John
            3. Amanda*/
        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + 1 + ". " + names.get(i));
        }
        //Remove the 2nd element
        names.remove(1);
        /*Iterate through the list in a reversed order and print out each name
            Amanda
            William*/
        String[] reverseArray = names.toArray(new String[0]);
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(reverseArray[i]);
        }
        //Remove all elements
        names.clear();
    }
}
