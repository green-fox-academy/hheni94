import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CountLines {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.

    String nameOfTheFile = "my-file.txt";
    numberOfLines(nameOfTheFile);
  }

  public static void numberOfLines (String filename) {
    try {
      Path filePath = Paths.get(filename);
      List<String> lines = Files.readAllLines(filePath);
      System.out.println(lines.size());
    } catch (Exception e) {
      System.out.println("0");
    }
  }
}
