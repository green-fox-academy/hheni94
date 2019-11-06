package com.hheni94.connectionwithmysql.services;

import com.hheni94.connectionwithmysql.models.Todo;

import java.util.List;

public interface ITodoService {

  List<Todo> findAll();
  Iterable<Todo> findAllByDone(Boolean done);
}
