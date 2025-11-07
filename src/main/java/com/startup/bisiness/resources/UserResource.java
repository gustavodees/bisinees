package com.startup.bisiness.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.startup.bisiness.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Maria", "maria@gmailcom", "999999", "12345");
		return ResponseEntity.ok().body(u);
		
	}
	
	
	
	
	
}
