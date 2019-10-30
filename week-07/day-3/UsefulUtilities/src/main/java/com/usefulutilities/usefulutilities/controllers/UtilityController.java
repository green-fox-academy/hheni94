package com.usefulutilities.usefulutilities.controllers;

import com.usefulutilities.usefulutilities.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {

  private UtilityService utilityService;

  @Autowired
  public UtilityController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping(value = "/useful")
  public String showUtilities() {
    return "index";
  }

  @GetMapping(value = "/useful/colored")
  public String displayEmptyPage(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "empty";
  }

  @GetMapping(value = "/useful/email")
  public String emailValidator(@RequestParam String email, Model model) {
    if(utilityService.validateEmail(email)) {
      model.addAttribute("text", email + " is a valid email address");
      model.addAttribute("color", "green");
    } else {
      model.addAttribute("text", email + " is not a valid email address");
      model.addAttribute("color", "red");
    }
    return "email";
  }

  @GetMapping(value = "/useful/caesarEncode")
  public String caesarEncoder(@RequestParam String text, @RequestParam int number, Model model) {
    model.addAttribute("encode", utilityService.caesar(text, number));
    return "caesar";
  }

  @GetMapping(value = "/useful/caesarDecode")
  public String caesarDecoder(@RequestParam String text, @RequestParam int number, Model model) {
    model.addAttribute("decode", utilityService.caesar(text, -number));
    return "caesardecode";
  }
}
