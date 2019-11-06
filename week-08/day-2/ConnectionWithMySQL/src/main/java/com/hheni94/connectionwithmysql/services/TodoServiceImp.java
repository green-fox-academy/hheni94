package com.hheni94.connectionwithmysql.services;


import com.hheni94.connectionwithmysql.models.Todo;
import com.hheni94.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImp implements ITodoService {

  private TodoRepository todoRepository;

  @Autowired
  public TodoServiceImp(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public List<Todo> findAll() {
    List<Todo> todoList = new ArrayList<>();
    todoRepository.findAll().forEach(todo -> todoList.add(todo));
    return todoList;
  }

  /*public List<Todo> findAllByDone(Boolean done) {
    if (done != null) {
      return todoRepository.findAllByDone(!done);
    } else {
      List<Todo> allTodo = new ArrayList<>();
      todoRepository.findAll().forEach(todo -> allTodo.add(todo));
      return allTodo;
    }
  }*/

  @Override
  public Iterable<Todo> findAllByDone(Boolean done) {
    if (done != null) {
      return todoRepository.findAllByDone(!done);
    } else {
      return todoRepository.findAll();
    }
  }
}
