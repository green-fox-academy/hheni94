package com.hheni94.connectionwithmysql.controllers;

import com.hheni94.connectionwithmysql.services.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    //Boolean active = isActive.equals("true") ? true : false; //Ha a Requestaram String isActive
    model.addAttribute("todos", service.findAllByDone(isActive));
    return "todolist";
  }
}
