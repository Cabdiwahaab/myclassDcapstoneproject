package com.myclassDcapstoneproject.springmvc.service;

import java.util.List;

import com.myclassDcapstoneproject.springmvc.entity.User;




public interface UserService {
	public List<User> getUsers();
	
	public void saveUserOrUpdat(User theUser);

	public User getUser(int theId);
	
	public void deleteUser(int theId);
	


}
