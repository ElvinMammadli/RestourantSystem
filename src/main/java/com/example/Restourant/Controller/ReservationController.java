package com.example.Restourant.Controller;

import com.example.Restourant.Model.Reservation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {

    @PostMapping("api/1.0/reservations")
    public void CreateReservation(@RequestBody Reservation reservation){

    }

}
