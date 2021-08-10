package com.example.Restourant.Service;

import com.example.Restourant.Controller.RestourantController;
import com.example.Restourant.Exception.RestourantNotFoundException;
import com.example.Restourant.Model.Reservation;
import com.example.Restourant.Model.Restourant;
import com.example.Restourant.Repository.ReservationRepository;
import com.example.Restourant.Repository.RestourantRepository;
import org.springframework.stereotype.Service;

@Service
public class RestourantService {

    RestourantRepository restourantRepository;

    public  RestourantService(RestourantRepository RestourantRepository){
        this.restourantRepository=RestourantRepository;
    }

    public void save(Restourant reservation) {
        restourantRepository.save(reservation);
    }

    public Restourant findById(Long id) {
        return restourantRepository.findById(id)
                .orElseThrow(()->new RestourantNotFoundException("Restourant Not Find id:"+id));

    }

    public Restourant findByUsername(String username){
        return restourantRepository.findByUsername(username)
                .orElseThrow(()->new RestourantNotFoundException("Restourant Not Find"));
    }
}
