import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Births {
  public static void main(String[] args) {
    // Create a function that
    // - takes the name of a CSV file as a parameter,
    //   - every row is in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
    // - returns the year when the most births happened.
    //   - if there were multiple years with the same number of births then return any one of them

    // You can find such a CSV file in this directory named births.csv
    // If you pass "births.csv" to your function, then the result should be either 2006, or 2016.

    String filename = "births.csv";
    System.out.println(getMostPopularBirthYear(filename));
  }

  public static String getMostPopularBirthYear(String filename) {
    Path filepath = Paths.get(filename);
    List<String> lines = new ArrayList<>();
    List<String> listForDates = new ArrayList<>();
    List<String> listForYears = new ArrayList<>();

    try {
      lines = Files.readAllLines(filepath);
    } catch (IOException e) {
      System.out.println("There is no file under this name.");
    }

    for (int i = 0; i < lines.size(); i++) {
      String[] words = lines.get(i).replace(";", " ").split(" ");
      String dates = words[2];
      listForDates.add(dates);
    }

    for (int i = 0; i < listForDates.size(); i++) {
      String[] dates = listForDates.get(i).replace("-", " ").split(" ");
      String years = dates[0];
      listForYears.add(years);
    }

    HashMap<String, Integer> result = new HashMap<>();
    String mostPopularYear = null;
    int maxOccurrence = 0;
    int length = listForYears.size();
    for (int k = 0; k < 1; k++) {
      for (int i = 0; i < length; i++) {
        int actualOccurrence = 0;
        String currentlyChecked = listForYears.get(i);
        if (!result.containsKey(currentlyChecked)) {
          for (int j = 0; j < length; j++) {
            if (listForYears.get(j).equals(currentlyChecked)) {
              actualOccurrence++;
            }
          }
          if (actualOccurrence > maxOccurrence) {
            maxOccurrence = actualOccurrence;
            mostPopularYear = currentlyChecked;
          }
        }
      }
      result.put(mostPopularYear, maxOccurrence);
      maxOccurrence = 0;
    }
    return mostPopularYear;
  }
}
