package com.hheni94.todoappandassignees.services;


import com.hheni94.todoappandassignees.models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ITodoService {

  List<Todo> findAll();

  void save(Todo todo);

  void delete(Long id);

  Iterable<Todo> findAllByDone(Boolean done);

  List<Todo> search(String searchByWhat, String searchedTodo);

  Todo findById(Long id);
}
