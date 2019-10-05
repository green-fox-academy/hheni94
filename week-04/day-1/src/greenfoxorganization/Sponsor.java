package greenfoxorganization;

public class Sponsor extends Person {
  private String company;
  private int hiredStudents;

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  public Sponsor() {
    super.setName("Jane Doe");
    super.setAge(30);
    super.setGender("female");
    this.company = "Google";
    this.hiredStudents = 0;
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + "year old " + getGender() + "who represents " + company + "and hired " + hiredStudents + "students so far.");
  }

  @Override
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public void hire() {
    hiredStudents++;
  }
}
