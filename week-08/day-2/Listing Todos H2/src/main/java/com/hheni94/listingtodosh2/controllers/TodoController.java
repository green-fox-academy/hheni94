package com.hheni94.listingtodosh2.controllers;

import com.hheni94.listingtodosh2.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo") //Így ha a localhost-ot megnyitom, akkor mindegyik endpoint elé ez a /todo kerül.
public class TodoController {

  private TodoService todoService;

  @Autowired
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", todoService.findAll());
    return "todolist";
  }
}
