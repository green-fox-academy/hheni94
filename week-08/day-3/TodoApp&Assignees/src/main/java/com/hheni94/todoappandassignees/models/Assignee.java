package com.hheni94.todoappandassignees.models;

import com.sun.javafx.geom.transform.Identity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Assignee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String email;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "assignee", fetch = FetchType.EAGER)
  private List<Todo> todos;

  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
    this.todos = new ArrayList<>();
  }

  public Assignee() {
    this.todos = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public List<Todo> getTodos() {
    return todos;
  }

  public void addTodo(Todo todo) {
    todo.setAssignee(this);
    todos.add(todo);
  }

  @Override
  public String toString() {
    return this.name;
  }
}
