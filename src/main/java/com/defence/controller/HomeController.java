package com.defence.controller;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.defence.dto.UserDto;
import com.defence.mapper.UserMapper;
import com.defence.service.UserService;

@Controller
public class HomeController {

	@Autowired private UserService us;
	
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@PreAuthorize("isAnonymous()")
	@GetMapping("/login")
	public String showLogin() {
		return "login";
	}
	
	@PreAuthorize("isAnonymous()")
	@GetMapping("/register")
	public String showRegister(Model model) {
		model.addAttribute("userDto", new UserDto());
		return "register";
	}

	@PostMapping("/register")
	public String addRegister(@Valid @ModelAttribute("userDto") UserDto userDto,
			Model model, BindingResult br) {
		
		if (br.hasErrors()) {
			return "register";
		}
		
		us.save(UserMapper.toOurUser(userDto));
		return "redirect:/";
	}
	
	@PreAuthorize("isAuthenticated()")
	@GetMapping("/my-profile")
	public String showProfile(Model model, Principal principal) {
		model.addAttribute("user", us.findUserByLogin(principal.getName()));
		return "my-profile";
	}
	
	@PreAuthorize("isAuthenticated()")
	@GetMapping("/users")
	public String showUsersList(Model model) {
		model.addAttribute("usersList", us.findAll());
		return "users-list";
	}
	
}
