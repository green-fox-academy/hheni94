package com.bankofsimba.bankofsimba.controllers;

import com.bankofsimba.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {
  private List<BankAccount> accounts;

  public BankAccountController() {
    accounts = new ArrayList<>();
    accounts.add(new BankAccount("Simba", 2000, "lion", true, true));
    accounts.add(new BankAccount("Scar", 4000, "lion"));
    accounts.add(new BankAccount("Mufasa", 3000, "lion", false, false));
    accounts.add(new BankAccount("Timon", 500, "suricate"));
    accounts.add(new BankAccount("Pumbaa", 800, "warthog"));
  }

  @GetMapping(value = "/show")
  public String showingOneAccount(Model model) {
    model.addAttribute("bankAccounts", accounts);
    return "showAccount";
  }

  @GetMapping(value = "/text")
  public String textHTML(Model model) {
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "text";
  }

  @GetMapping(value = "/accounts")
  public String showAccounts(Model model) {
    model.addAttribute("accountOfAnimal", accounts);
    return "accounts";
  }
}
