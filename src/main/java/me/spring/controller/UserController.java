package me.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.spring.model.User;
import me.spring.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping
	public ResponseEntity<User> create(@RequestBody User userToCreate){
		var userCreated = userService.create(userToCreate);
		return ResponseEntity.ok(userCreated);
	}
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> listUsers = userService.findAll();
		return ResponseEntity.ok(listUsers);
	}
	

}
