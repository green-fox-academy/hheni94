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
  public void delete(Long id) {
    todoRepository.deleteById(id);
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
  public List<Todo> search(String searchedTodo, String searchByWhat) {
    //return todoRepository.findTodoByActionNamePart("%" + searchedTodo + "%");
    if (searchByWhat.equals("action")) {
      return todoRepository.findAllByTitleContainsIgnoreCase(searchedTodo);
    } else if (searchByWhat.equals("creationDate")) {
      return todoRepository.findAllByCreationDateContainsIgnoreCase(searchedTodo);
    } else if (searchByWhat.equals("dueDate")) {
      return todoRepository.findAllByDueDateContainsIgnoreCase(searchedTodo);
    } else if (searchByWhat.equals("assigneeName")) {
      //return todoRepository.findAllByAssigneeNameContainsIgnoreCase(searchedTodo);
      return todoRepository.findTodoByAssigneeNamePart(searchedTodo);
    }
    return null;
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
