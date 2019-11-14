package com.hheni94.newprogrammerfoxclub.controllers;

import com.hheni94.newprogrammerfoxclub.services.IMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class TrickController {

  IMainService iMainService;

  @Autowired
  public TrickController(IMainService iMainService) {
    this.iMainService = iMainService;
  }

  @GetMapping(value = "/trickcenter")
  public String showTrickCenterPage(@RequestParam String name, Model model) {
    List<String> learnables = iMainService.getTrickLibrary().stream()
        .filter(trick -> !iMainService.findFox(name).getTricks().contains(trick))
        .collect(Collectors.toList());

    model.addAttribute("learnables", learnables);
    model.addAttribute("name", name);
    return "trickcenter";
  }

  @PostMapping(value = "/trickcenter")
  public String learnTrick(@RequestParam String name, @RequestParam String trickToLearn) {
    iMainService.findFox(name).learnTricks(trickToLearn);
    return "redirect:/?name=" + name;
  }
}
