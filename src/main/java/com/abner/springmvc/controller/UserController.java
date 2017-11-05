package com.abner.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.abner.springmvc.model.User;

//implement CRUD in one controller

@Controller
@RequestMapping("/user")
public class UserController {

	Map<String, User> userMap = new HashMap<String, User>();
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public String showAllUsers(Model model){
		model.addAttribute("result", userMap);
		return "users";
	}
	
	@RequestMapping(value="/{username}", method=RequestMethod.GET)
	public String findUser(@PathVariable String username, Model model){
		model.addAttribute("result", userMap.get(username));
		return "user";
	}
	
	@RequestMapping(value="/newuser", method=RequestMethod.GET)
	public String addUser(Model model){
		model.addAttribute(new User());
		return "newuser";
	}
	
	@RequestMapping(value="/newuser", method=RequestMethod.POST)
	public String addUser(@ModelAttribute User user, BindingResult br){
		if(br.hasErrors()){
			return "updateuser";
		}
		userMap.put(user.getUsername(), user);
		return "redirect:users";
	}
	
	@RequestMapping(value="/{username}/update", method=RequestMethod.GET)
	public String updateUser(@PathVariable String username, Model model){
		model.addAttribute(userMap.get(username));
		return "updateuser";
	}
	
	@RequestMapping(value="/{username}/update", method=RequestMethod.POST)
	public String updateUser(@Validated User user, BindingResult br){
		if(br.hasErrors()){
			return "updateuser";
		}
		userMap.put(user.getUsername(),user);
		return "redirect:/user/users";
	}
	
	@RequestMapping(value="/{username}/delete", method=RequestMethod.GET)
	public String deleteUser(@PathVariable String username, Model model){
		userMap.remove(username);
		return "redirect:/user/users";
	}
	
	@RequestMapping(value="/{username}", method=RequestMethod.PUT)
	public void updateUser(@PathVariable String username){
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String helloUser(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg", "Abner");
		modelAndView.setViewName("hello");
		return "redirect:/user/users";
	}
	
	public UserController(){
		User user1 = new User("Sam", 40);
		User user2 = new User("Tony", 28);
		userMap.put(user1.getUsername(), user1);
		userMap.put(user2.getUsername(), user2);
	}
}
