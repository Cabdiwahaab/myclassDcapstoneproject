package com.myclassDcapstoneproject.springmvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myclassDcapstoneproject.springmvc.dao.UserDAO;
import com.myclassDcapstoneproject.springmvc.entity.User;




@Service
public class UserServiceImpl implements UserService {


	// need to inject customer dao
	@Autowired
	private UserDAO userDAO;
	
	@Override
	@Transactional
	public List<User> getUsers() {
		
		return userDAO.getUsers();
	}
	@Override
	@Transactional
	public void saveUserOrUpdat(User theUser) {

		userDAO.saveUser(theUser);
	}
	@Override
	@Transactional
	public User getUser(int theId) {
		
		return userDAO.getUser(theId);


}
	@Override
	@Transactional
	public void deleteUser(int theId) {
		userDAO.deleteUser(theId);
		
	}
}
