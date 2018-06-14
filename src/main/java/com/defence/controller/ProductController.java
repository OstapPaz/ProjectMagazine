package com.defence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.defence.dto.ProductDto;
import com.defence.mapper.ProductMapper;
import com.defence.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired ProductService ps;

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/add")
	public String showAddProduct(Model model) {
		model.addAttribute("productDto", new ProductDto());
		return "add-product";
	}
	
	@PostMapping("/add")
	public String addProduct(@ModelAttribute("productDto") ProductDto productDto,
			Model model) {
		ps.saveProduct(ProductMapper.toProduct(productDto));
		return "redirect:/";
	}
	
}
