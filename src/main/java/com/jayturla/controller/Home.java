package com.jayturla.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jayturla.form.ProductEntityForm;
import com.jayturla.service.ProductService;


@Controller
@RequestMapping(value="/")
public class Home {
	
	final static Logger LOGGER = LoggerFactory.getLogger(Home.class);
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView homePage() {
		LOGGER.debug("test debug");
		ModelAndView model = new ModelAndView("home");
		model.addObject("productEntityForm", new ProductEntityForm());
		model.addObject("helloWorld","Hello World Test");
		return model;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(@ModelAttribute ProductEntityForm productEntityForm){
		productService.saveProduct(productEntityForm);
		return "redirect:/viewProduct";
	}
	
	@RequestMapping(value="/viewProduct")
	public ModelAndView viewProduct() {
		ModelAndView model = new ModelAndView("viewProduct");
		model.addObject("productEntityForm", new ProductEntityForm());
		model.addObject("helloWorld","Hello World Test");
		return model;
	}
}
