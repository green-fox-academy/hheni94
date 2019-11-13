package com.hheni94.backendapi.controllers;

import com.hheni94.backendapi.models.*;
import com.hheni94.backendapi.models.Number;
import com.hheni94.backendapi.services.ILogService;
import com.hheni94.backendapi.services.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;

@RestController
public class MyRestController {

  private NumberService numberService;
  private ILogService iLogService;

  @Autowired
  public MyRestController(NumberService numberService, ILogService iLogService) {
    this.numberService = numberService;
    this.iLogService = iLogService;
  }

  @GetMapping(value = "/doubling")
  public ResponseEntity<Object> getDoubled(@RequestParam(required = false) Integer input) {
    Log log = new Log(new Date(System.currentTimeMillis()), "/doubling", "input= " + input);
    iLogService.save(log);
    if (input != null) {
      return ResponseEntity.status(HttpStatus.OK).body(new Number(input));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new MyError("Please provide an input!"));
    }
  }

  @GetMapping(value = "/greeter")
  public ResponseEntity<Object> greet(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
    Log log = new Log(new Date(System.currentTimeMillis()), "/greeter", "name: " + name + ", title: " + title);
    iLogService.save(log);
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

  @GetMapping(value = "/appenda/{appendable}")
  public ResponseEntity<?> append(@PathVariable String appendable) {
    Log log = new Log(new Date(System.currentTimeMillis()), "/appenda/{appendable}", "appendable= " + appendable);
    iLogService.save(log);
    if (appendable != null) {
      return ResponseEntity.status(HttpStatus.OK).body(new Append(appendable + 'a'));
    } else {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping(value = "/dountil/{action}")
  public ResponseEntity<?> doUntil(@RequestBody(required = false) DoUntil number, @PathVariable String action) {
    Log log = new Log(new Date(System.currentTimeMillis()), "/dountil/{action}", "number= " + number.getUntil() + ", action: " + action);
    iLogService.save(log);
    if (action.equals("sum")) {
      return ResponseEntity.status(HttpStatus.OK).body(new DoUntilResult(numberService.sum(number.getUntil())));
    } else if (action.equals("factor")) {
      return ResponseEntity.status(HttpStatus.OK).body(new DoUntilResult(numberService.factor(number.getUntil())));
    } else if (number == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError("Please provide a number!"));
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping(value = "/arrays")
  public ResponseEntity<?> arrayHandler(@RequestBody(required = false) MyArray inputArray) {
    Log log = new Log(new Date(System.currentTimeMillis()), "/arrays", "what: " + inputArray.getWhat() + ", numbers: " + Arrays.toString(inputArray.getNumbers()));
    iLogService.save(log);
    if (inputArray == null || inputArray.getWhat() == null || inputArray.getNumbers() == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError("Please provide what to do with the numbers!"));
    } else {
      if (inputArray.getWhat().equals("sum")) {
        return ResponseEntity.status(HttpStatus.OK).body(new MyArrayResultInt(numberService.sumArray(inputArray.getNumbers())));
      } else if (inputArray.getWhat().equals("multiply")) {
        return ResponseEntity.status(HttpStatus.OK).body(new MyArrayResultInt(numberService.multiplyArray(inputArray.getNumbers())));
      } else if (inputArray.getWhat().equals("double")) {
        return ResponseEntity.status(HttpStatus.OK).body(new MyArrayResultArray(numberService.doubleArray(inputArray.getNumbers())));
      } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
    }
  }

  @GetMapping(value = "/log")
  public ResponseEntity<Object> listLogs() {
    return ResponseEntity.status(HttpStatus.OK).body(new LogOutput(iLogService.listAllLog(), iLogService.listAllLog().size()));
  }
}
