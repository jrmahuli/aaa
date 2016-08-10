package com.javahash.spring.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
public class HelloWorldController {
 
 @RequestMapping("/")
 public String hello() {
  
   return "helloworld";
 
 }
 
}