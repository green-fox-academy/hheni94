package greenfoxorganization;

public class Student extends Person {
  private String previousOrganization;
  private int skippedDays;

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }

  public Student() {
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    skippedDays = skippedDays + numberOfDays;
  }

  public void setPreviousOrganization(String previousOrganization) {
    this.previousOrganization = previousOrganization;
  }

  public String getPreviousOrganization() {
    return this.previousOrganization;
  }

  public void setSkippedDays(int skippedDays) {
    this.skippedDays = skippedDays;
  }

  public int getSkippedDays() {
    return this.skippedDays;
  }
}
