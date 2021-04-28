package com.myin28minutes.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource
{
	
	@Autowired
	private UserDaoService service;
	
	
	//GET /users
	//retrieveAllUsers
	
	@GetMapping("/users")
	public List<User> getAllUsers()
	{
		return service.findAll();
	}
		
	
	//Get /users/{id}
	//retrieveUser(int id)
	@GetMapping("/users/{id}")
	public User GetUser(@PathVariable int id)
	{
		return service.findOne(id);
	}
	
	//input: details of the user
	//ouput: CREATED & Return the created URI
	@PostMapping("/users")
	public void addUser(@RequestBody User user)
	{
		User savedUser = service.save(user);
	}
}
