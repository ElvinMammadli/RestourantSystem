package com.example.Restourant.Controller;

import com.example.Restourant.DTO.ReservationDto;
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
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.Restourant.Model.AppUserRole.USER;

@RestController
public class ReservationController {
    private static final Log LOG = LogFactory.getLog(UserController.class);

    @Autowired
    ReservationService reservationService;

    @PostMapping("api/1.0/create/reservation")
    @ResponseStatus(HttpStatus.CREATED)
    public void CreateReservation(@RequestBody Reservation reservation){
        reservationService.createReservation(reservation);

    }

    @RequestMapping("api/1.0/getreservation")
    public List<Reservation> getReservations(){
        return reservationService.getReservations();
    }


}
