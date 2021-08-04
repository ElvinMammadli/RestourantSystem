package com.example.Restourant.Controller;

import com.example.Restourant.Model.User;
import com.example.Restourant.Repository.UserRepository;
import com.example.Restourant.Service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    private static final Log LOG = LogFactory.getLog(UserController.class);

    @PostMapping("api/1.0/user")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody User User){
        userService.save(User);
        LOG.info(User.getUsername());
    }
}
