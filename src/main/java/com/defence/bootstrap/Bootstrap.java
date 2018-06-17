package com.defence.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.defence.entity.User;
import com.defence.entity.enums.UserRole;
import com.defence.repository.UserRepository;

@Component
public class Bootstrap implements CommandLineRunner {

	@Autowired private UserRepository ur;
	
	@Autowired private PasswordEncoder pe; 
	
	@Override
	public void run(String... args) throws Exception {
		
		if (ur.count() == 0) {
			
			User user = User.builder().login("user")
					.password(pe.encode("123"))
					.role(UserRole.ROLE_USER)
					.build();
			ur.save(user);
			
			User admin = User.builder().login("admin")
					.password(pe.encode("123"))
					.role(UserRole.ROLE_ADMIN)
					.build();
			ur.save(admin);
			
		}
		
	}

	
	
}
