package fleet;

public class FleetOfThings {
  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // - You have the `Thing` class
    // - You have the `Fleet` class
    // - You have the `FleetOfThings` class with a `main` method
    // - Download those, use those
    // - In the main method create a fleet
    // - Achieve this output:
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Thing firstTask = new Thing("Get milk");
    Thing secondTask = new Thing("Remove the obstacles");
    Thing thirdTask = new Thing("Stand up");
    thirdTask.complete();
    Thing fourthTask = new Thing("Eat lunch");
    fourthTask.complete();

    fleet.add(firstTask);
    fleet.add(secondTask);
    fleet.add(thirdTask);
    fleet.add(fourthTask);

    System.out.println(fleet);
  }
}
