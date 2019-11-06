package com.hheni94.todoappandassignees.controllers;

import com.hheni94.todoappandassignees.models.Assignee;
import com.hheni94.todoappandassignees.repositories.AssigneeRepository;
import com.hheni94.todoappandassignees.services.IAssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {

  private IAssigneeService assigneeService;
  private AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeController(IAssigneeService assigneeService, AssigneeRepository assigneeRepository) {
    this.assigneeService = assigneeService;
  }

  @GetMapping(value = {"/", "/list"})
  public String showAssignees(Model model) {
    model.addAttribute("assignees", assigneeService.findAll());
    return "assignees";
  }

  @PostMapping(value = "/add")
  public String addNewAssignee(@RequestParam String name, String email) {
    assigneeService.addNewAssignee(name, email);
    return "addassignee";
  }
}
