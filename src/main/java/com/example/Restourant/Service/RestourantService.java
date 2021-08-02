package com.example.Restourant.Service;

import com.example.Restourant.Controller.RestourantController;
import com.example.Restourant.Model.Reservation;
import com.example.Restourant.Model.Restourant;
import com.example.Restourant.Repository.ReservationRepository;
import com.example.Restourant.Repository.RestourantRepository;
import org.springframework.stereotype.Service;

@Service
public class RestourantService {

    RestourantRepository RestourantRepository;

    public  RestourantService(RestourantRepository RestourantRepository){
        this.RestourantRepository=RestourantRepository;
    }
    public void save(Restourant reservation) {
        RestourantRepository.save(reservation);
    }
}
