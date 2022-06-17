package com.example.demo.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	  @RequestMapping("/hello")
	  public String hello(Model model) {
	    model.addAttribute("hello", "Hello World!");
	    return "hello";
	  }

}
