package com.example.Restourant.Service;

import com.example.Restourant.Controller.UserController;
import com.example.Restourant.Model.User;
import com.example.Restourant.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepository userRepository;
    public void save(User user){
        userRepository.save(user);

    }
}
