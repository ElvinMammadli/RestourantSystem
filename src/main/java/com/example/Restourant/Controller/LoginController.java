package com.example.Restourant.Controller;

import com.example.Restourant.Exception.UserNotFoundException;
import com.example.Restourant.Model.User;
import com.example.Restourant.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    UserService userService;

    @PostMapping("/api/1/user/login")
    public boolean validateUser(@RequestBody User requestedUser){
        User user=userService.findByUsername(requestedUser.getUsername());
        if(user==null){
            throw new UserNotFoundException("User not found");
        }
        else{
            if(user.getPassword().equals(requestedUser.getPassword())){
                return true;
            }

            else {
                throw new UserNotFoundException("Wrong Password");
            }
        }
    }


}
