package com.mycapstone.springboot.thymeleafdemo.controller;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;





@Controller

public class DashboardController {
	
	
	
  @GetMapping("/takeTest")
  public String getDashboard () {
    return "takeTest";
  }
  
 
  
  @GetMapping("/logout")
  public String logout () {
    return "logout";
  }
}