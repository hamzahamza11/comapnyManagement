package com.example.company.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.company.entity.user;
import com.example.company.service.userService;

@RestController
public class userController {

	@Autowired
	private userService userService;

	public userController() {
		// TODO Auto-generated constructor stub
	}
		
		@PostMapping("/user")
		public user  addUser(@RequestBody user theUser) {
			
		return	userService.saveUser(theUser);

		}
		
		
		
		@PutMapping("/user/{id}")
		public user  putUser(@PathVariable int id,@RequestBody user theUser) {
			
		return	userService.putUser(id,theUser);

		}
		
		@DeleteMapping("/user/{id}")
		public void deleteUser(@PathVariable int id) {
			
			userService.deleteUser(id);

		}
		
		@GetMapping("/user/{id}")
		public Optional<user> getUser(@PathVariable int id) {
			
			return userService.getUser(id);

		}
}
