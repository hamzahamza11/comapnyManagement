package com.example.company.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/company")


public class viewController {
	
	@GetMapping("/")
	public String showForm(){
		System.out.println("hey");
		return "hello world ";
	}

}
