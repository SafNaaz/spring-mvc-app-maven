package com.tcs.spring.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.spring.demo.service.CustomerService;

@RestController
public class MyController {
	   @Autowired
	   private CustomerService custService;
	
	   @GetMapping("/")
       public ModelAndView getView(@RequestParam Map<String, String> map) {
		   ModelAndView view = new ModelAndView("Test");
		   view.addObject("message", "Message from controller");
		   view.addObject("id", "The value passed "+map.get("id"));
		  // view.addObject("cust", attributeValue)
    	   
    	   return view;
       }
	   
	   @GetMapping("/viewdetails/{id}")
	   public ModelAndView getCustomerDetails(@PathVariable String id) {
		   
		   ModelAndView view = new ModelAndView("View");
		   view.addObject("cust", custService.getCustomer(id));
		   
		   return view;
	   }

}
