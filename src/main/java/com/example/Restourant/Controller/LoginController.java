package com.example.Restourant.Controller;

import com.example.Restourant.Exception.RestourantNotFoundException;
import com.example.Restourant.Exception.UserNotFoundException;
import com.example.Restourant.Model.Restourant;
import com.example.Restourant.Model.User;
import com.example.Restourant.Service.RestourantService;
import com.example.Restourant.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    UserService userService;

    @Autowired
    RestourantService restourantService;

    private static final Logger log = LoggerFactory.getLogger(LoginController.class);

    @PostMapping("/api/1/user/login")
    public User validateUser(@RequestBody User requestedUser){
        User user=userService.findByUsername(requestedUser.getUsername());
        if(user==null){
            throw new UserNotFoundException("User not found");
        }
        else{
            if(user.getPassword().equals(requestedUser.getPassword())){
                return user;
            }

            else {
                throw new UserNotFoundException("Wrong Password");
            }
        }
    }

    @PostMapping("/api/1/restourant/login")
    public Restourant validateRestourant(@RequestBody Restourant requestedRestourant){
        Restourant restourant = restourantService.findByUsername(requestedRestourant.getName());
        if(restourant==null){
            throw new RestourantNotFoundException("Restourant not found");
        }
        else{
            if(restourant.getPassword().equals(requestedRestourant.getPassword())){
                return restourant;
            }
            else{
                throw new RestourantNotFoundException("Wrong Password");
            }
        }

    }


}
