package com.hheni94.todoappandassignees.repositories;


import com.hheni94.todoappandassignees.models.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findAllByDone(Boolean done); //Ez belemehet az interface service-be
  List<Todo> findAllByTitleContainsIgnoreCase(String title);
  List<Todo> findAllByCreationDateContainsIgnoreCase(String date);
  List<Todo> findAllByDueDateContainsIgnoreCase(String date);
  //List<Todo> findAllByAssigneeNameContainsIgnoreCase(String name);

//  @Query(value = "SELECT * FROM Todo t WHERE t.action Like :partOfAction", nativeQuery = true)
//  List<Todo> findTodoByActionNamePart(@Param("partOfAction") String search);

  @Query(value = "SELECT * FROM Todo t WHERE t.assigneeName Like :partOfAssigneeName", nativeQuery = true)
  List<Todo> findTodoByAssigneeNamePart(@Param("partOfAssigneeName") String search);
}
