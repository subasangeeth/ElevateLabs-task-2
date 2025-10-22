package com.springapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WebApp {
	
		
		 @GetMapping("/")
		    public ModelAndView homePage(Model model) {
		       
			 ModelAndView mv=new ModelAndView();
			    
			 
			 	String version = "v3.1.1";
			 	model.addAttribute("message", "Welcome to Spring Boot");
		        model.addAttribute("version", version);
		        mv.setViewName("index.html");
		        return mv;
		   
	}


}
