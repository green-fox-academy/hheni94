package greenfoxorganization;

public class Mentor extends Person {
  private String level;

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    super.setName("Jane Doe");
    super.setAge(30);
    super.setGender("female");
    this.level = "intermediate";
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + "year old " + getGender() + level + "mentor.");
  }

  @Override
  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }
}
