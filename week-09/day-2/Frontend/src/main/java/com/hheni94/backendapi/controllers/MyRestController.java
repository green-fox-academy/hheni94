package com.hheni94.backendapi.controllers;

import com.hheni94.backendapi.models.MyError;
import com.hheni94.backendapi.models.MyWelcome;
import com.hheni94.backendapi.models.Number;
import com.hheni94.backendapi.services.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

  NumberService numberService;

  @Autowired
  public MyRestController(NumberService numberService) {
    this.numberService = numberService;
  }

  @GetMapping(value = "/doubling")
  public ResponseEntity<Object> getDoubled(@RequestParam (required = false) Integer input) {
    if (input != null) {
      return ResponseEntity.status(HttpStatus.OK).body(new Number(input));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new MyError("Please provide an input!"));
    }
  }

  @GetMapping( value = "/greeter")
  public ResponseEntity<Object> greet(@RequestParam (required = false) String name, @RequestParam (required = false) String title) {
    if (name != null && title != null) {
      return ResponseEntity.status(HttpStatus.OK).body(new MyWelcome("Oh, hi there " + name + ", my dear " + title + "!"));
    } else if (name == null) {
      if (title == null) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError("Please provide a name and a title!"));
      } else {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError("Please provide a name!"));
      }
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError("Please provide a title!"));
    }
  }
}
