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
		return "user/login";
	}
	
	@PreAuthorize("isAnonymous()")
	@GetMapping("/register")
	public String showRegister(Model model) {
		model.addAttribute("userDto", new UserDto());
		return "user/register";
	}

	@PostMapping("/register")
	public String addRegister(@Valid @ModelAttribute("userDto") UserDto userDto, BindingResult br) {
		
		if (br.hasErrors()) {
			return "user/register";
		}
		
		us.save(UserMapper.toOurUser(userDto));
		return "redirect:/";
	}
	
	@PreAuthorize("isAuthenticated()")
	@GetMapping("/my-profile")
	public String showProfile(Model model, Principal principal) {
		model.addAttribute("user", us.findUserByLogin(principal.getName()));
		return "user/my-profile";
	}
		
	
}
