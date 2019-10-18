import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP addresses.
    // Write a function that returns the GET / POST request ratio.

    String filename = "log.txt";
    getIPAddresses(filename);
    System.out.println(getRatio(filename));
  }

  public static String[] getIPAddresses(String filename) {
    Path filepath = Paths.get(filename);
    List<String> lines = new ArrayList<>();
    List<String> ipAddresses = new ArrayList<>();

    try {
      lines = Files.readAllLines(filepath);
    } catch (IOException e) {
      System.out.println("There is no file under this filename.");
    }

    for (int i = 0; i < lines.size(); i++) {
      String[] words = lines.get(i).replace("   ", "  ").replace("  ", " ").split(" ");
      String neededIP = words[5];
      if (!ipAddresses.contains(neededIP)) {
        ipAddresses.add(neededIP);
      }
    }

    String[] arrayOfIPAddress = ipAddresses.toArray(new String[0]);
    return arrayOfIPAddress;
  }

  public static String getRatio(String filename) {
    Path filepath = Paths.get(filename);
    List<String> lines = new ArrayList<>();

    try {
      lines = Files.readAllLines(filepath);
    } catch (IOException e) {
      System.out.println("There is no file under this filename.");
    }

    int counterGet = 0;
    int counterPost = 0;
    for (int i = 0; i < lines.size(); i++) {
      String[] words = lines.get(i).replace("   ", "  ").replace("  ", " ").split(" ");
      String getOrPost = words[6];
      if (getOrPost.equals("GET")) {
        counterGet++;
      } else {
        counterPost++;
      }
    }
    return (counterGet + " / " + counterPost);
  }
}