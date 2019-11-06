package com.hheni94.connectionwithmysql.repositories;


import com.hheni94.connectionwithmysql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findAllByDone(Boolean done); //Ez belemehet az interface service-be
}
