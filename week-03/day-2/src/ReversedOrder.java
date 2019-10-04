import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
  public static void main(String[] args) {
    // Create a method that decrypts reversed-order.txt

    String fileName = "reversed-order.txt";
    reversedOrder(fileName);
  }

  public static void reversedOrder(String originFile) {
    try {
      List<String> lines = Files.readAllLines(Paths.get(originFile));
      ArrayList<String> reversedOrder = new ArrayList<>();
      for (int i = lines.size() - 1; i >= 0; i--) {
        String empty = "";
        for (int j = 0; j < lines.get(i).length(); j++) {
            empty += lines.get(i).charAt(j);
        }
        reversedOrder.add(empty);
      }
      Files.write(Paths.get(originFile), reversedOrder);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

