package com.hheni94.listingtodosh2;

import com.hheni94.listingtodosh2.controllers.TodoController;
import com.hheni94.listingtodosh2.models.Todo;
import com.hheni94.listingtodosh2.repositories.TodoRepository;
import com.hheni94.listingtodosh2.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Listingtodosh2Application implements CommandLineRunner {

  private TodoRepository todoRepository;

  @Autowired
  public Listingtodosh2Application(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(Listingtodosh2Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Start the day"));
    todoRepository.save(new Todo("Finish H2 workshop1"));
    todoRepository.save(new Todo("Finish JPA workshop2"));
    todoRepository.save(new Todo("Create a CRUD project"));
  }
}
