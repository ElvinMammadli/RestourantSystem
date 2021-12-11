package com.example.Restourant.Controller;

import com.example.Restourant.Exception.UserAlreadyExistsException;
import com.example.Restourant.Exception.UserNotFoundException;
import com.example.Restourant.Model.User;
import com.example.Restourant.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("api/1/user")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody User requestedUser){
        User user=userService.findByUsername(requestedUser.getUsername());
        if(user!=null){
            throw new UserAlreadyExistsException("User already exists");
        }else userService.save(requestedUser);
    }


    @GetMapping("/api/1/users")
    public ResponseEntity<List<User>> findUsers(){
        return ResponseEntity.ok(userService.findUsers());
    }


    @GetMapping("/api/1/user/name/{username}")
    public User findByUsername(@PathVariable String username){
        User user =userService.findByUsername(username);
        if(user==null){
            throw new UserNotFoundException("User Not Found");
        }else return user;
    }


    @GetMapping("/api/1/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        User user =userService.findById(id);
        return ResponseEntity.ok(userService.findById(id));
    }

    @PatchMapping("api/1/user/user/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return ResponseEntity.ok().build();
    }






}

