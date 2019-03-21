package com.payment.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.payment.exception.ResourceNotFoundException;
import com.payment.model.AddMoney;
import com.payment.model.User;
import com.payment.repository.UserRepository;
import com.payment.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserService userService;

	
	@GetMapping("/Users")
	public List<User> getAllUsers() {
		List<User> userList=userService.getAllUsers();
		return userList;
	}
	
	@GetMapping("/User")
	public User getSelfUser() throws ResourceNotFoundException {
		User user= userService.getSelfUser();
		return user;
	}
		
	@PostMapping("/User")
	public String addUser(@RequestBody User user) {
		//int count=
		User user1=userService.addUser(user);
		 
		 if (user1!=null) return "user added successfully"; 
				 //ResponseEntity.noContent().build();
		 
		 else return "user addition failed";
		/*
		 * URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
		 * "").buildAndExpand(user.getId()).toUri();
		 */
		 
		//return ResponseEntity.created(location).build();

	}
	
	@PostMapping("/UserAddMoney")
	public String addMoney(@RequestBody AddMoney addMoney) throws NumberFormatException, ResourceNotFoundException
	{
		String response=userService.addMoney(addMoney);
		
		return response;
	}
}
