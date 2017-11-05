package com.abner.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//implement CRUD in one controller

@Controller
public class LoginController {

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showAllUsers(Model model){
		return "login";
	}
}
