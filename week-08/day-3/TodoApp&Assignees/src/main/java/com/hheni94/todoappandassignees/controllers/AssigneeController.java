package com.hheni94.todoappandassignees.controllers;

import com.hheni94.todoappandassignees.models.Assignee;
import com.hheni94.todoappandassignees.repositories.AssigneeRepository;
import com.hheni94.todoappandassignees.services.IAssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {

  private IAssigneeService assigneeService;

  @Autowired
  public AssigneeController(IAssigneeService assigneeService) {
    this.assigneeService = assigneeService;
  }

  @GetMapping(value = {"/", "/list"})
  public String showAssignees(Model model) {
    model.addAttribute("assignees", assigneeService.findAll());
    return "assignees";
  }

  @GetMapping(value = "/add")
  public String add(@ModelAttribute(name = "assignee")Assignee assignee) {
  //public String add() {
    return "addassignee";
  }

  @PostMapping(value= "/add")
  public String save(@ModelAttribute(name = "assignee")Assignee assignee) {
    assigneeService.save(assignee);
    return "redirect:/assignee/list";
  }

  @GetMapping(value = "/{id}/delete")
  public String delete(@PathVariable(name = "id") Long id) {
    assigneeService.delete(id);
    return "redirect:/assignee/list";
  }

  @GetMapping(value = "/{id}/edit")
  public String showEditForm(Model model, @PathVariable(name = "id") Long id) {
    model.addAttribute("editedAssignee", assigneeService.findById(id));
    return "editassignee";
  }

  @PostMapping(value = "/{editedId}/edit")
  public String edit(Model model, @ModelAttribute Assignee edited, @PathVariable(name = "editedId") Long newId) {
    edited.setId(newId);
    assigneeService.save(edited);
    return "redirect:/assignee/list";
  }
}
