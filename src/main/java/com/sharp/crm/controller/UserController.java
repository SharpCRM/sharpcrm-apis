package com.sharp.crm.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharp.crm.model.User;
import com.sharp.crm.services.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserService userService;
	
	
	@PostMapping("/addUser")
	public User save(@RequestBody User user) {
		log.info("Saving  user in the database.");
		return userService.saveUser(user);

	}
	

	@GetMapping("/users")
	public List<User> getUsers() {
		return userService.getAllUsers();
	}
	
	
	 
    @GetMapping("/users/{id}") 
    public User getUser(@PathVariable int id){
        return userService.getUserById(id);
    }
	
	@DeleteMapping("/deleteusers/{id}")
	public String deleteUser(@PathVariable int id) {
		return userService.deleteuser(id);
	}
	

}
