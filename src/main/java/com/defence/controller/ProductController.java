package com.defence.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
		List<String> types = new ArrayList<String>();
		types.add("gas catridges");
		types.add("knives");
		types.add("pneumatic weapons");
		types.add("baseball sticks");
		types.add("clothes");
		types.add("others");
		model.addAttribute("types", types);
		return "product/add-product";
	}
	
	@PostMapping("/add")
	public String addProduct(@ModelAttribute("productDto") ProductDto productDto,
			Model model) {
		ps.saveProduct(ProductMapper.toProduct(productDto));
		return "redirect:/";
	}
	
	@GetMapping("/all")
	public String allProducts(Model model) {
		model.addAttribute("product", ps.findAll());
		return "product/all";
	}
	
	@GetMapping("/knives")
	public String showKnives(Model model) {
		model.addAttribute("product", ps.findByType("knives"));
		return "product/sort";
	}
	
	@GetMapping("/gas")
	public String showGasCatridges(Model model) {
		model.addAttribute("product", ps.findByType("gas catridges"));
		return "product/sort";
	}
	
	@GetMapping("/pneumatic")
	public String showPneumaticWeapon(Model model) {
		model.addAttribute("product", ps.findByType("pneumatic weapons"));
		return "product/sort";
	}
	
	@GetMapping("/sticks")
	public String showBaseballSticks(Model model) {
		model.addAttribute("product", ps.findByType("baseball sticks"));
		return "product/sort";
	}
	
	@GetMapping("/clothes")
	public String showClothes(Model model) {
		model.addAttribute("product", ps.findByType("clothes"));
		return "product/sort";
	}
	
	@GetMapping("/othes")
	public String showOthes(Model model) {
		model.addAttribute("product", ps.findByType("othes"));
		return "product/sort";
	}
	
	
	
}
