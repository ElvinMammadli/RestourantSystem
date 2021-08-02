package com.example.Restourant.Controller;

import com.example.Restourant.Model.Reservation;
import com.example.Restourant.Service.ReservationService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {
    private static final Log LOG = LogFactory.getLog(UserController.class);

    @Autowired
    ReservationService reservationService;

    @PostMapping("api/1.0/reservations")
    public void CreateReservation(@RequestBody Reservation reservation){
        reservationService.save(reservation);
        LOG.info(reservation.getDate());

    }

}
