package com.hheni94.newprogrammerfoxclub.controllers;

import com.hheni94.newprogrammerfoxclub.models.Fox;
import com.hheni94.newprogrammerfoxclub.services.IMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  IMainService iMainService;

  @Autowired
  public MainController(IMainService iMainService) {
    this.iMainService = iMainService;
  }

  @GetMapping(value = {"", "/"})
  public String showIndexPage(Model model, @RequestParam(name = "name", required = false) String name) {
    Fox actualFox = iMainService.findFox(name);

    if (actualFox.getName() == null) {
      return "login";
  } else {
      model.addAttribute("fox", actualFox);
      return "index";
  }
}

  @GetMapping(value = "/login")
  public String showLoginPage() {
    return "login";
  }

  @PostMapping(value = "/login")
  public String receiveName(@RequestParam String name) {
    return "redirect:/?name=" + name;
  }

  @GetMapping(value = "/create")
  public String showCreateForm(@ModelAttribute("fox") Fox fox) {
    return "create";
  }

  @PostMapping(value = "/create")
  public String createFox(@ModelAttribute("fox") Fox fox) {
    if (iMainService.alreadyExist(fox)) {
      return "redirect:/create";
    } else {
      iMainService.addFox(fox);
      return "redirect:/?name=" + fox.getName();
    }
  }
}
