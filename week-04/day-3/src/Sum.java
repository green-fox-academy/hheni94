import java.util.ArrayList;

public class Sum {

  public Integer sumOfTheElements(ArrayList<Integer> listOfSum) {
    Integer sum = 0;
    if (listOfSum == null) {
      return null;
    } else {
      for (int i = 0; i < listOfSum.size(); i++) {
        sum += listOfSum.get(i);
      }
      return sum;
    }
  }
}
