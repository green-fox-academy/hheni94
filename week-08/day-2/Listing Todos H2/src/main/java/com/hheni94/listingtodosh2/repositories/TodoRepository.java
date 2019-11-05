package com.hheni94.listingtodosh2.repositories;

import com.hheni94.listingtodosh2.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long>{
}
