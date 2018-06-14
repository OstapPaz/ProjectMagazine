package com.defence.service;

import java.util.List;

import com.defence.entity.User;

public interface UserService {

	void save(User user);
	
	User findUserById(Integer id);
	
	List<User> findAll();
	
	void update(User user);
	
	User findUserByLogin(String login);
	
}
