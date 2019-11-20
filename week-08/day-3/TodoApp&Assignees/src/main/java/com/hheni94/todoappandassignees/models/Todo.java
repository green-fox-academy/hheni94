package com.hheni94.todoappandassignees.models;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) //Automatikusan növelni fogja az ID-t
  private long id;

  @Column(name = "action")
  private String title;

  @Column(name = "is_urgent")
  private boolean urgent = false;

  @Column(name = "is_done")
  private boolean done = false;

  @ManyToOne()
  private Assignee assignee;

  @Transient //Ez nem fog belekerülni az adatbázisba, amit ezzel megjelölök.
  private Long assigneeId;

  private String creationDate = formatDate();
  private String dueDate;

  public Todo(long id, String title, boolean urgent, boolean done, Assignee assignee) {
    this.id = id;
    this.title = title;
    this.urgent = urgent;
    this.done = done;
    this.assignee = assignee;
  }

  public Todo(String title, boolean urgent, boolean done) {
    this.title = title;
    this.urgent = urgent;
    this.done = done;
  }

  public Todo() {
  }

  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }

  public Todo(String title) {
    this.title = title;
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public Long getAssigneeId() {
    if (assignee == null) {
      return 0L;
    } else {
      return assignee.getId();
    }
  }

  public String getAssigneeName() {
    if (assignee == null) {
      return "";
    } else {
      return assignee.getName();
    }
  }

  public Long getAssigneeIdForEditing() {
    return assigneeId;
  }

  public void setAssigneeId(Long assigneeId) {
    this.assigneeId = assigneeId;
  }

  private String formatDate() {
    String stringDateFormat = "yyyy-MM-dd/hh:mm";
    DateFormat dateFormat = new SimpleDateFormat(stringDateFormat);
    String formattedDate = dateFormat.format(new Date());
    return formattedDate;
  }

  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public String getDueDate() {
    return dueDate;
  }

  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }
}
