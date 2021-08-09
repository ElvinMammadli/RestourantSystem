package com.example.Restourant.Service;

import com.example.Restourant.Exception.UserNotFoundException;
import com.example.Restourant.Model.User;
import com.example.Restourant.Repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void save(User user){

        userRepository.save(user);
    }


    public User  findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public Optional<User> findById(Long id){
        return userRepository.findById(id);
    }

    public List<User> findUsers(){return userRepository.findAll();}

    public  void deleteUser(Long id) {
        userRepository.deleteById(id);
    }



}
