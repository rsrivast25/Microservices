package com.myin28minutes.rest.webservices.restfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// to specify this is a Controller that can handle HTTP request
@RestController
public class HelloWorldController
{
	//method return "Hello World"
	//GET
	//URI - /hello-world
	
	//  to create a mapping for rest URI		 
	//@RequestMapping(method = RequestMethod.GET, path = "/hello-world" )	
	@GetMapping(path = "/hello-world")
	public String helloWorld()
	{
		return "Hello World";
	}
	
	// Create a object for hello-world-bean and return that instead of string
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean()
	{
		return new HelloWorldBean("Hello World");
	}
	
	// pass path variable
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name )
	{
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
}
