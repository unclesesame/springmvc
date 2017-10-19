package com.abner.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.abner.springmvc.model.User;

//implement CRUD in one controller

@Controller
public class UserController {

	Map<String, User> userMap = new HashMap<String, User>();
	
	@RequestMapping(value="/user/users", method=RequestMethod.GET)
	public String showAllUsers(Model model){
		model.addAttribute("result", userMap);
		return "users";
	}
	
	@RequestMapping(value="/user/{username}", method=RequestMethod.GET)
	public String findUser(@PathVariable String username, Model model){
		model.addAttribute("result", userMap.get(username));
		return "user";
	}
	
	@RequestMapping(value="/user/newuser", method=RequestMethod.GET)
	public String addUser(Model model){
		model.addAttribute(new User());
		return "newuser";
	}
	
	@RequestMapping(value="/user/newuser", method=RequestMethod.POST)
	public String addUser(@ModelAttribute User user){
		userMap.put(user.getUsername(), user);
		return "redirect:users";
	}
	
	public UserController(){
		User user1 = new User("Sam", 40);
		User user2 = new User("Tony", 28);
		userMap.put(user1.getUsername(), user1);
		userMap.put(user2.getUsername(), user2);
	}
}
