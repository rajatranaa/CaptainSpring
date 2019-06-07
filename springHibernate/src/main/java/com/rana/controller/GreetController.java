package com.rana.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class GreetController {
	
	
   @RequestMapping(value= "/")    
   public  ModelAndView greetings(HttpServletRequest request) 
   {
    	ModelAndView model = new ModelAndView();
    	model.setViewName("greet");
    	
    	return model;
    }
}