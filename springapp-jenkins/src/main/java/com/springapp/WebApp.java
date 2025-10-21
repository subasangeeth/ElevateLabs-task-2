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
			    mv.setViewName("index.jsp");
			 
			 	String version = "v2.5.1";
		        model.addAttribute("version", version);
		        model.addAttribute("message", "This Spring Web App is deployed via Jenkins CI/CD!");
		        return mv; 
		   
	}

}