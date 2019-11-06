package com.hheni94.todoappandassignees.services;

import com.hheni94.todoappandassignees.models.Assignee;
import com.hheni94.todoappandassignees.models.Todo;
import com.hheni94.todoappandassignees.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssigneeServiceImp implements IAssigneeService {

  AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeServiceImp(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  @Override
  public List<Assignee> findAll() {
    List<Assignee> assigneeList = new ArrayList<>();
    assigneeRepository.findAll().forEach(assignee -> assigneeList.add(assignee));
    return assigneeList;
  }

  @Override
  public void editNameOfAssignee(long id) {

  }

  @Override
  public void delete(long id) {
    assigneeRepository.deleteById(id);
  }

  @Override
  public void addNewAssignee(String name, String email) {
    assigneeRepository.save(new Assignee(name, email));
  }
}
