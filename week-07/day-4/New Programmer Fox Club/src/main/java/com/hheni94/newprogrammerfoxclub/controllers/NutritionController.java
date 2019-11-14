package com.hheni94.newprogrammerfoxclub.controllers;

import com.hheni94.newprogrammerfoxclub.services.IMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NutritionController {

  IMainService iMainService;

  @Autowired
  public NutritionController(IMainService iMainService) {
    this.iMainService = iMainService;
  }

  @GetMapping(value = "/nutritionstore")
  public String showNutritionStorePage(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    return "nutrition";
  }

  @PostMapping(value = "/nutritionstore")
  public String nutrition(@RequestParam String name, @RequestParam String food, @RequestParam String drink) {
    iMainService.findFox(name).setFood(food);
    iMainService.findFox(name).setDrink(drink);
    return "redirect:/?name=" + name;
  }
}
