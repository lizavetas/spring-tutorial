package com.example.springtutorial.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
  @RequestMapping("/index")
  public String geHome() {
    return "index";
  }
}
