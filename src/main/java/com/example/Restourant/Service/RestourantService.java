package com.example.Restourant.Service;

import com.example.Restourant.Model.Restourant;
import com.example.Restourant.Repository.RestourantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestourantService {
    @Autowired
    RestourantRepository restourantRepository;


    public  RestourantService(RestourantRepository restourantRepository){
        this.restourantRepository=restourantRepository;
    }

    public void save(Restourant restourant) {
        restourantRepository.save(restourant);
    }

    public Optional<Restourant> findById(Long id) {
        return restourantRepository.findById(id);
    }

    public Restourant findByUsername(String username){
        return restourantRepository.findByname(username);
    }

    public List<Restourant> findRestourants(){
        return restourantRepository.findAll();
    }

    public void deleteUser (Long id){
        restourantRepository.deleteById(id);
    }


}
