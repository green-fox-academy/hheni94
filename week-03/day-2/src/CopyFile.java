import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    // Write a function that copies the contents of a file into another
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful

    String fileOne = "my-file.txt";
    String fileTwo = "my-file2.txt";
    System.out.println(copyFiles(fileOne, fileTwo));
  }

  public static boolean copyFiles (String filenameOne, String filenameTwo) {
    try {
      List<String> lines = Files.readAllLines(Paths.get(filenameOne));
      Files.write(Paths.get(filenameTwo), lines);
      return true;
    } catch (IOException e) {
      System.out.println("The copy was unsuccesful!");
      return false;
    }
  }
}
