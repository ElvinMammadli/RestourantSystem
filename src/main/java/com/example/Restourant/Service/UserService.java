package com.example.Restourant.Service;

import com.example.Restourant.Exception.UserAlreadyExistsException;
import com.example.Restourant.Exception.UserNotFoundException;
import com.example.Restourant.Model.User;
import com.example.Restourant.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void save(User user){
        userRepository.save(user);
    }


    public User findByUsername  (String username) throws UserNotFoundException{
        return userRepository.findByUsername(username);
    }

    public User findById(Long id){

        return userRepository.findById(id).orElseThrow(()-> new UserNotFoundException("User Not Found id:"+id));
    }

    public List<User> findUsers(){return userRepository.findAll();}

    public User findByUsernameAndPassword(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

    public  void deleteUser(Long id) {
        userRepository.deleteById(id);
    }



}
