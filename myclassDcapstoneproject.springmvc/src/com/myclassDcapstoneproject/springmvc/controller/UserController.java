package com.myclassDcapstoneproject.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myclassDcapstoneproject.springmvc.entity.User;
import com.myclassDcapstoneproject.springmvc.service.UserService;

@ControllerAdvice
@RequestMapping("/user")
public class UserController {
	// need to inject customerDao
	@Autowired
	private UserService userService;
	
	@RequestMapping("/Admin")
	public String listUsers(Model theModel)
	{
		// get customers from the customer dao
		List<User> theUerss = userService.getUsers();
		theModel.addAttribute("users", theUerss);
		return  "Admin";
	}
	

@GetMapping("/showFormForAdd")
public String showFormForAdd(Model theModel)
{
	// create model attribute to bind form data
	User theUser = new User();
	theModel.addAttribute("user",theUser);
	
	
	return "admin-form";
}

@PostMapping("/saveUser")
public String saveUser(@ModelAttribute("user") User theUser) {
	
	// save the customer using our service
	userService.saveUserOrUpdat(theUser);
	
	
	return "redirect:Admin";
}

@GetMapping("/showFormForUpdate")
public String showFormForUpdate(@RequestParam("userId") int theId,
								Model theModel) 
{
	
	// get the customer from our service
	User theUser = userService.getUser(theId);	
	
	// set customer as a model attribute to pre-populate the form
	theModel.addAttribute("user", theUser);
	
	// send over to our form		
	return "admin-form";
}

@GetMapping("/deleteUser")

public String deleteUser(@RequestParam("userId") int theId)
{
	userService.deleteUser(theId);
	return "redirect:Admin";
}

@RequestMapping("/Register")
public String diiwaangali(Model theModel)
{
	User theUser = new User();
	theModel.addAttribute("user",theUser);
	
	return  "Register";
}


@RequestMapping("/logIn")
public String signInUsers()
{
	
	return  "logIn";
}


@RequestMapping("/contactUs")
public String contactUsers()
{
	
	return  "contactUs";
}

@RequestMapping("/home")
public String home()
{
	
	return  "home";
}


@RequestMapping("/logout")
public String logout()
{
	
	return  "logout";
}

}

