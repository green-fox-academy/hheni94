package greenfoxorganization;

import java.util.ArrayList;

public class Cohort {
  private String name;
  private ArrayList<Student> students;
  private ArrayList<Mentor> mentors;

  public Cohort(String name) {
    this.name = name;
    students = new ArrayList<>();
    mentors = new ArrayList<>();
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println("The " + name + "cohort has " + students.size() + "students and " + mentors.size() + "mentors.");
  }
}
