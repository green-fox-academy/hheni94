package com.hheni94.todoappandassignees.services;


import com.hheni94.todoappandassignees.models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ITodoService {

  List<Todo> findAll();

  Iterable<Todo> findAllByDone(Boolean done);

  List<Todo> searched(String searchedTodo);
}