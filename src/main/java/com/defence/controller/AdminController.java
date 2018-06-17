package com.defence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.defence.dto.UserDto;
import com.defence.entity.enums.UserRole;
import com.defence.mapper.UserMapper;
import com.defence.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired private UserService us;
	
	@GetMapping("/users")
	public String showUsersList(Model model) {
		model.addAttribute("usersList", us.findAll());
		return "admin/users-list";
	}
	
	@PostMapping("/users/{userId}")
	public String setAsAdmin(Model model,
			@PathVariable("userId") int userId) {
		UserDto userDto = UserMapper.toDtoUser(us.findUserById(userId));
		userDto.setRole(UserRole.ROLE_ADMIN);
		us.update(UserMapper.toOurUserSetRole(userDto));
		model.addAttribute("usersList", us.findAll());
		return "admin/users-list";
	}
	
	@GetMapping("profile/{userId}")
	public String showUserProfile(Model model,
			@PathVariable("userId") int userId) {
		model.addAttribute("user", us.findUserById(userId));
		return "admin/user-profile";
	}
	
	
}
