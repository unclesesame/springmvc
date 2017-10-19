package com.abner.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg", "spring mvc demo");
		modelAndView.setViewName("hello");
		return modelAndView;
	}
	
}
