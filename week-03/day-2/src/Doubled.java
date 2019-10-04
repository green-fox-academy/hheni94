import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt

    String fileName = "duplicated-chars.txt";
    decrypt(fileName);
  }

  public static void decrypt (String originFile) {
    try {
    List<String> lines = Files.readAllLines(Paths.get(originFile));
    ArrayList<String> decryptedLines = new ArrayList<>();
    for (int i = 0; i < lines.size(); i++) {
      String empty = "";
      for (int j = 0; j < lines.get(i).length(); j++) {
        if (j % 2 == 0) {
          empty += lines.get(i).charAt(j);
        }
      }
      decryptedLines.add(empty);
    }
    Files.write(Paths.get(originFile), decryptedLines);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
