package com.example.Restourant.Controller;

import com.example.Restourant.Model.Reservation;
import com.example.Restourant.Model.Restourant;
import com.example.Restourant.Model.User;
import com.example.Restourant.Repository.ReservationRepository;
import com.example.Restourant.Repository.RestourantRepository;
import com.example.Restourant.Repository.UserRepository;
import com.example.Restourant.Service.ReservationService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ReservationController {
    private static final Log LOG = LogFactory.getLog(UserController.class);

    @Autowired
    ReservationService reservationService;

    @PostMapping("api/1/create/reservation")
    @ResponseStatus(HttpStatus.CREATED)
    public void CreateReservation(@RequestBody Reservation reservation){
        reservationService.createReservation(reservation);
    }


    @GetMapping("/api/1/reservation/{id}")
    public  List<Reservation>  getReservationsByUserId(@PathVariable Long id){
        List<Reservation> reservations  =reservationService.getReservationsByUserId(id);
        return (List<Reservation>)reservations;
    }

    @RequestMapping("api/1/getreservation")
    public List<Reservation> getReservations(){
        return reservationService.getReservations();
    }


}
