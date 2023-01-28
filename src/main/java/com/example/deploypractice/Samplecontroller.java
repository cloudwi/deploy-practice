package com.example.deploypractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Samplecontroller {

  @GetMapping
  public String test() {
    return "success";
  }
}
