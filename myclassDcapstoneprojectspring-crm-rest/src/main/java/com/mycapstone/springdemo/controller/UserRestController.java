package com.mycapstone.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycapstone.springdemo.entity.User;
import com.mycapstone.springdemo.rest.UserNotFoundException;
import com.mycapstone.springdemo.service.UserService;

@RestController
@RequestMapping("/api")
public class UserRestController {

	// autowire the CustomerService
	@Autowired
	private UserService userService;
	
	// add mapping for GET /customers
	@GetMapping("/users")
	public List<User> getUsers() 
	{
		
		return userService.getUsers();
		
	}
	
	// add mapping for GET /customers/{customerId}
	
		@GetMapping("/users/{userId}")
		public User getUser(@PathVariable int userId) {
			
			User theUser = userService.getUser(userId);
			
			if (theUser == null) {
				throw new UserNotFoundException("Sorry! This user id not in your database - " + userId);
			}
			
			return theUser;
		}

		// add mapping for POST /customers  - add new customer
		
		@PostMapping("/users")
		public User addUser(@RequestBody User theUser) {
			
			// also just in case the pass an id in JSON ... set id to 0
			// this is force a save of new item ... instead of update
			
			theUser.setId(0);
			
			userService.saveUser(theUser);
			
			return theUser;
		}
		
			
	
	
		
}
