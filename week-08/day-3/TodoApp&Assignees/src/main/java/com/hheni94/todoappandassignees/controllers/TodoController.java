package com.hheni94.todoappandassignees.controllers;

import com.hheni94.todoappandassignees.models.Assignee;
import com.hheni94.todoappandassignees.models.Todo;
import com.hheni94.todoappandassignees.services.IAssigneeService;
import com.hheni94.todoappandassignees.services.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/todo") //Így ha a localhost-ot megnyitom, akkor mindegyik endpoint elé ez a /todo kerül.
public class TodoController {

  private ITodoService service;
  private IAssigneeService assigneeService;

  @Autowired
  public TodoController(ITodoService service, IAssigneeService assigneeService) {
    this.service = service;
    this.assigneeService = assigneeService;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model, @RequestParam(required = false) Boolean isActive) {
    //Boolean active = isActive.equals("true") ? true : false; //Ha a Requestparam String isActive
    model.addAttribute("todos", service.findAllByDone(isActive));
    //model.addAttribute("assignees", assigneeService.findAll());
    return "todolist";
  }

//  @PostMapping(value = "/list")
//  public String search(Model model, @RequestParam String searched) {
//    model.addAttribute("todos", service.searched(searched));
//    return "todolist";
//  }

  @GetMapping(value = "/add")
  public String add(@ModelAttribute(name = "todo")Todo todo) {
    return "addtodo";
  }

  @PostMapping(value = "/add")
  public String save(@ModelAttribute(name = "todo")Todo todo) {
    service.save(todo);
    return "redirect:/todo/list";
  }

  @GetMapping(value = "/{id}/delete")
  public String delete(@PathVariable(name = "id") Long id) {
    //service.delete(service.findById(id));
    service.delete(id);
    return "redirect:/todo/list";
  }

  @GetMapping(value = "/{id}/edit")
  public String showEditForm(Model model, @PathVariable(name = "id") Long id) {
    model.addAttribute("editedTodo", service.findById(id));
    model.addAttribute("assignees", assigneeService.findAll());
    return "edittodo";
  }

  @PostMapping(value = "/{editedId}/edit")
  public String edit(@ModelAttribute Todo edited, @PathVariable(name = "editedId") Long currentTodoId) {
    edited.setId(currentTodoId);
    //edited.getAssignee().getId();
    edited.setAssignee(assigneeService.findById(edited.getAssigneeIdForEditing()));
    //assigneeService.findById(edited.getAssigneeId());
    service.save(edited);
//    edited.setAssignee(assigneeService.findById(newId));
//    service.save(edited);
    return "redirect:/todo/list";
  }

  @PostMapping(value = "/list")
  public String search(Model model, @RequestParam (name = "searchByWhat") String searchByWhat, @RequestParam (name = "searchedTodo") String searchedTodo) {
    List<Todo> searched = service.search(searchByWhat, searchedTodo);
    model.addAttribute("todos", searched);
    return "todolist";
  }
}
