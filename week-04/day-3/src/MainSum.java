import java.util.ArrayList;

public class MainSum {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(4);
    list.add(6);
    list.add(22);

    Sum sum = new Sum();
    System.out.println(sum.sumOfTheElements(list));
  }
}
