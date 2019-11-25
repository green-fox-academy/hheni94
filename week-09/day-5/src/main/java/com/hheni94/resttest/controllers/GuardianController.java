package com.hheni94.resttest.controllers;

import com.hheni94.resttest.models.Groot;
import com.hheni94.resttest.models.MyError;
import com.hheni94.resttest.models.Yondu;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping(value = "/groot")
  public ResponseEntity<Object> translateMessage(@RequestParam (required = false) String receivedMessage) {
    if (receivedMessage == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError());
    }
    return ResponseEntity.status(HttpStatus.OK).body(new Groot(receivedMessage));
  }

  @GetMapping(value = "/yondu")
  public ResponseEntity calculateSpeed(@RequestParam (required = false) Double distance, @RequestParam (required = false) Double time) {
    if (distance == null || time == null) {
      return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
    return ResponseEntity.status(HttpStatus.OK).body(new Yondu(distance, time));
  }
}
