package com.hheni94.todoappandassignees;

import com.hheni94.todoappandassignees.models.Assignee;
import com.hheni94.todoappandassignees.models.Todo;
import com.hheni94.todoappandassignees.repositories.AssigneeRepository;
import com.hheni94.todoappandassignees.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.expression.spel.ast.Assign;

@SpringBootApplication
public class TodoappandassigneesApplication implements CommandLineRunner {

  private TodoRepository todoRepository;
  private AssigneeRepository assigneeRepository;

  @Autowired
  public TodoappandassigneesApplication(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
    this.todoRepository = todoRepository;
    this.assigneeRepository = assigneeRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodoappandassigneesApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
//    todoRepository.save(new Todo("Start the day"));
//    todoRepository.save(new Todo("Finish H2 workshop1"));
//    todoRepository.save(new Todo("Finish JPA workshop2"));
//    todoRepository.save(new Todo("Create a CRUD project"));
//    todoRepository.save(new Todo("Make the beds", true, true));
//    todoRepository.save(new Todo("Tidy up", true, false));
//    todoRepository.save(new Todo("Mop", true, false));
//    todoRepository.save(new Todo("Clean the bathroom and the kitchen", true, true));

    Assignee henriett = new Assignee("Henriett", "henriett@gmail.com");
    Assignee agnes = new Assignee("Agnes", "agi@gmail.com");
    Todo bake = new Todo("Bake apple pie", true, false);
    Todo eatChips = new Todo("Eat chips");

    henriett.addTodo(bake);
    agnes.addTodo(eatChips);

    //assigneeRepository.save(henriett);
    //assigneeRepository.save(agnes);
  }
}
