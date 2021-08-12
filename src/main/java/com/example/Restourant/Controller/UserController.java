package com.example.Restourant.Controller;

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
    public void createUser(@RequestBody User User){
        userService.save(User);
    }

    @GetMapping("/api/1/users")
    public ResponseEntity<List<User>> findUsers(){
        return ResponseEntity.ok(userService.findUsers());
    }

    @GetMapping("/api/1/user/name/{username}")
    public User findByUsername(@PathVariable String username){
        return userService.findByUsername(username);
    }

    @GetMapping("/api/1/users/id/{id}")
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

