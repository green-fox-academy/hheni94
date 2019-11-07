package com.hheni94.todoappandassignees.controllers;

import com.hheni94.todoappandassignees.models.Todo;
import com.hheni94.todoappandassignees.services.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo") //Így ha a localhost-ot megnyitom, akkor mindegyik endpoint elé ez a /todo kerül.
public class TodoController {

  private ITodoService service;

  @Autowired
  public TodoController(ITodoService service) {
    this.service = service;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model, @RequestParam(required = false) Boolean isActive) {
    //Boolean active = isActive.equals("true") ? true : false; //Ha a Requestparam String isActive
    model.addAttribute("todos", service.findAllByDone(isActive));
    return "todolist";
  }

  @PostMapping(value = "/list")
  public String search(Model model, @RequestParam String searched) {
    model.addAttribute("todos", service.searched(searched));
    return "todolist";
  }

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
    service.delete(id);
    return "redirect:/todo/list";
  }

  @GetMapping(value = "/{id}/edit")
  public String showEditForm(Model model, @PathVariable(name = "id") Long id) {
    model.addAttribute("editedTodo", service.findById(id));
    return "edittodo";
  }

  @PostMapping(value = "/{editedId}/edit")
  public String edit(Model model, @ModelAttribute Todo edited, @PathVariable(name = "editedId") Long newId) {
    edited.setId(newId);
    service.save(edited);
    return "redirect:/todo/list";
  }
}
