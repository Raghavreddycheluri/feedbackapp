package com.raghav.feedbackapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.raghav.feedbackapp.model.User;
import com.raghav.feedbackapp.repository.UserRepository;

@RestController
public class UsersController {

	@Autowired 
	private UserRepository userRepository;
	 @RequestMapping(value="/register", method = RequestMethod.POST)
    @ResponseBody
    public String userRegister(@RequestParam String name, @RequestParam String password,@RequestParam String role,
    		@RequestParam int batch_id,
    		@RequestParam String gender){

        User user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setRole(role);
        user.setBatch_id(batch_id);
        user.setGender(gender);
        userRepository.save(user);
        System.out.println(user);
        return "registered successfully"; 
        
            
    }
	
}
