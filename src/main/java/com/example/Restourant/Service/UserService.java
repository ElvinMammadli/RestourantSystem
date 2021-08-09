package com.example.Restourant.Service;

import com.example.Restourant.Exception.UserNotFoundException;
import com.example.Restourant.Model.User;
import com.example.Restourant.Repository.UserRepository;
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


    public User findByUsername  (String username) throws UserNotFoundException{
        return userRepository.findByUsername(username).orElseThrow(() -> new UserNotFoundException());
    }

    public Optional<User> findById(Long id){
        return userRepository.findById(id);
    }

    public List<User> findUsers(){return userRepository.findAll();}

    public User findByUsernameAndPassword(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

    public  void deleteUser(Long id) {
        userRepository.deleteById(id);
    }



}
