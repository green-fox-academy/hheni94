package greenfoxorganization;

public class Sponsor extends Person {
  private String company;
  private int hiredStudents;

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
  }

  public Sponsor() {
    this.hiredStudents = 0;
    this.company = "Google";
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  @Override
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public void hire() {
    hiredStudents++;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getCompany() {
    return this.company;
  }

  public void setHiredStudents(int hiredStudents) {
    this.hiredStudents = hiredStudents;
  }

  public int getHiredStudents() {
    return this.hiredStudents;
  }
}
