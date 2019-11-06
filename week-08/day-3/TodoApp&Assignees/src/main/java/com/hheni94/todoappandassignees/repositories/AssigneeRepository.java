package com.hheni94.todoappandassignees.repositories;

import com.hheni94.todoappandassignees.models.Assignee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
}