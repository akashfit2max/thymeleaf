package com.practice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model model) {
		System.out.println("inside about handler");
		model.addAttribute("name", "Ashish kumar sahoo");
		model.addAttribute("currentDate", new Date());
		return "about";
	}

	@GetMapping("/loop")
	public String loopHandler(Model model) {
		List<String> names = List.of("Ankit", "Laxmi", "John", "Ashish");
		model.addAttribute("names", names);
		return "loop";
	}

//	conditional operator
	@GetMapping("/conditional")
	public String condHandler(Model model) {
		System.out.println("inside cond op page");
		model.addAttribute("isActive", true);
		return "cpage";
	}
	
//	if unless
	
	@GetMapping("/isunless")
	public String isunless(Model model) {
		model.addAttribute("gender", "F");
		return "cpage";
	}

}
