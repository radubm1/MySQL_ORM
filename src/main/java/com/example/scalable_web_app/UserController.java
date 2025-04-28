package com.example.scalable_web_app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
    private UserService userService;
    @GetMapping("/users")
    public String getUsers() {
        // Use caching to reduce the number of database queries
    	StringBuilder sb = new StringBuilder();
    	List<User> users;
		try {
			users = userService.getUsers();
			for(User u :users)
		        sb.append(u.getName());
			return sb.toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Users";
    }
}
