package com.hheni94.webshop.controllers;

import com.hheni94.webshop.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ShopItemController {
  private List<ShopItem> listOfShopItems = new ArrayList<>();

  public ShopItemController() {
    listOfShopItems.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000.0, 5));
    listOfShopItems.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2));
    listOfShopItems.add(new ShopItem("Coca cola", "0.5l standard coke", 25.0, 0));
    listOfShopItems.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100));
    listOfShopItems.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.0, 1));
  }

  @GetMapping(value = "/shopItemList")
  public String listShopItems(Model model) {
    model.addAttribute("shopItems", listOfShopItems);
    return "list";
  }

  @GetMapping(value = "/only-available")
  public String availableItems(Model model) {
    List<ShopItem> availableItems = listOfShopItems.stream()
        .filter(shopItems -> shopItems.getQuantityOfStock() > 0)
        .collect(Collectors.toList());
    model.addAttribute("shopItems", availableItems);
    return "list";
  }

  @GetMapping(value = "/cheapest-first")
  public String cheapestFirst(Model model) {
    List<ShopItem> cheapestFirst = listOfShopItems.stream()
        .sorted(Comparator.comparingDouble(ShopItem::getPrice))
        .collect(Collectors.toList());
    model.addAttribute("shopItems", cheapestFirst);
    return "list";
  }

  @GetMapping(value = "/contains-nike")
  public String checkContainsNike(Model model) {
    List<ShopItem> containsNike = listOfShopItems.stream()
        .filter(shopItems -> shopItems.getDescription().contains("nike"))
        .collect(Collectors.toList());
    model.addAttribute("shopItems", containsNike);
    //System.out.println(containsNike);
    return "list";
  }
}
