package com.defence.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.defence.entity.User;
import com.defence.repository.UserRepository;
import com.defence.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired UserRepository ur;
	
	@Autowired PasswordEncoder pe;
	
	@Override
	public void save(User user) {
		String password = user.getPassword();
		user.setPassword(pe.encode(password));
		ur.save(user);
	}
	
	@Override
	public void update(User user) {
		ur.save(user);
	}

	@Override
	public User findUserById(Integer id) {
		return ur.getOne(id);
	}

	@Override
	public List<User> findAll() {
		return ur.findAll();
	}

	@Override
	public User findUserByLogin(String login) {
		return ur.findUserByLogin(login);
	}

	@Override
	public void deleteById(Integer id) {
		ur.deleteById(id);
	}
	
	

	
	
}
