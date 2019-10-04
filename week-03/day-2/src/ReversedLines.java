import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt
    String fileName = "reversed-lines.txt";
    reversedLines(fileName);
  }

  public static void reversedLines(String originFile) {
    try {
      List<String> lines = Files.readAllLines(Paths.get(originFile));
      ArrayList<String> reversedLines = new ArrayList<>();
      for (int i = 0; i < lines.size(); i++) {
        String empty = "";
        for (int j = lines.get(i).length() - 1; j >= 0; j--) {
            empty += lines.get(i).charAt(j);
        }
        reversedLines.add(empty);
      }
      Files.write(Paths.get(originFile), reversedLines);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}