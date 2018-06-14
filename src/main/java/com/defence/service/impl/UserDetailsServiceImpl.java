package com.defence.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.defence.entity.User;
import com.defence.mapper.UserMapper;
import com.defence.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired UserRepository ur;
	
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		User user = ur.findUserByLogin(login);
		
		if(user == null) {
			throw new UsernameNotFoundException("User with login" + login + "not found");
		}
		
		return UserMapper.toSecurityUser(user) ;
	}

	
}
