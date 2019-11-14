package com.hheni94.todoappandassignees.services;

import com.hheni94.todoappandassignees.models.Todo;
import com.hheni94.todoappandassignees.repositories.TodoRepository;
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

  @Override
  public void save(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public void delete(Todo todo) {
    todoRepository.delete(todo);
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

  @Override
  public List<Todo> searched(String searchedTodo) {
    return todoRepository.findTodoByActionNamePart("%" + searchedTodo + "%");
  }

  @Override
  public Todo findById(Long id) {
    if (!todoRepository.findById(id).isPresent()) {
      return null;
    } else {
      return todoRepository.findById(id).get();
    }
  }
}
