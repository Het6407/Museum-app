package com.museum.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.museum.model.User;

public interface UserService extends UserDetailsService{

	List<User> getAllUsers();
	
	void saveUser(User user);
	
	User getUserById(Long id);
	
	void deleteUserById(Long id);

	void changeStatus(long id);

	User findByUsername(String userName);

	User getProfileImage(Long id);

	User findById(Long id);

	User createUser(User user);

	//User editUser(Long id, User userDetails);
	
	void editUser(User user1);
	
	
	
	
	
}
