package com.hheni94.todoappandassignees.services;

import com.hheni94.todoappandassignees.models.Assignee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IAssigneeService {
  List<Assignee> findAll();
  void editNameOfAssignee(long id);
  void delete(long id);
  void addNewAssignee(String name, String email);
}
