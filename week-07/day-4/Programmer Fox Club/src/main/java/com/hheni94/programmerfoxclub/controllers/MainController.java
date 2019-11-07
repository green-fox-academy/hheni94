package com.hheni94.programmerfoxclub.controllers;

import com.hheni94.programmerfoxclub.models.Fox;
import com.hheni94.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  FoxService foxService;

  @Autowired
  public MainController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping(value = "/")
  public String showIndexPage(@RequestParam (required = false) String name, Model model) {
    if (name == null || foxService.emptyChecker() || !foxService.nameChecker(name)) {
      return "redirect:/login";
    } else {
      model.addAttribute("received", foxService.getFoxByName(name).getName());
      return "index";
    }
  }

  @GetMapping(value = "/login")
  public String showLoginPage() {
    return "login";
  }

  @PostMapping(value = "/login")
  public String receiveName(@RequestParam String name, Model model) {
    if (foxService.nameChecker(name)) {
      model.addAttribute("received", name);
      return "index";
    } else {
      foxService.addFoxes(name);
      return "redirect:/?name=" + name;
    }
  }
}
