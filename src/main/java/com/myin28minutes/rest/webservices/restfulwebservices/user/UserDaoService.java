package com.myin28minutes.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class UserDaoService
{
	private static List<User> users = new ArrayList<>();
	
	//typically the id is calculated by the backend
	private static int usersCount = 3;
	
	static {
		
		users.add(new User (1, "Adam", new Date()));
		users.add(new User (2, "Eve", new Date()));
		users.add(new User (3, "Jack", new Date()));
	}
	
	//Methods
	
	//Return all the user, List<User> findAll()
	public List<User> findAll()
	{
		return users;
	}
	
	//Return a specific user, User findOne(int id)
	public User findOne (int id)
	{
		for(User element : users)
		{
			if(element.getId() == id)
				return element;
		}
		
		return null;
	}
	
	//Add a user, save(User user)
	public User save(User user)
	{
		if(user.getId() == null)
			user.setId(++usersCount);
		users.add(user);
		
		return user;
	}

}
