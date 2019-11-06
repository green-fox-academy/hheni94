package com.hheni94.todoappandassignees;

import com.hheni94.todoappandassignees.models.Assignee;
import com.hheni94.todoappandassignees.models.Todo;
import com.hheni94.todoappandassignees.repositories.AssigneeRepository;
import com.hheni94.todoappandassignees.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoappandassigneesApplication implements CommandLineRunner {

  private TodoRepository todoRepository;
  private AssigneeRepository assigneeRepository;

  @Autowired
  public TodoappandassigneesApplication(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodoappandassigneesApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Start the day"));
    todoRepository.save(new Todo("Finish H2 workshop1"));
    todoRepository.save(new Todo("Finish JPA workshop2"));
    todoRepository.save(new Todo("Create a CRUD project"));
    todoRepository.save(new Todo("Make the beds", true, true));
    todoRepository.save(new Todo("Tidy up", true, false));
    todoRepository.save(new Todo("Mop", true, false));
    todoRepository.save(new Todo("Clean the bathroom and the kitchen", true, true));

    //assigneeRepository.save(new Assignee("Ági", "agnes.laposi@gmail.com"));
    //assigneeRepository.save(new Assignee("Heni", "havasi.heni0@gmail.com"));
  }
}
