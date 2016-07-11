package com.jayturla.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {
	
	@RequestMapping(value="/")
	public ModelAndView homePage() {
		ModelAndView model = new ModelAndView("home");
		
		model.addObject("helloWorld","Hello World Test");
		return model;
	}
}
