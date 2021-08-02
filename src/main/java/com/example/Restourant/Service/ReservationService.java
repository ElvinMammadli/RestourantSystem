package com.example.Restourant.Service;

import com.example.Restourant.Model.Reservation;
import com.example.Restourant.Repository.ReservationRepository;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    ReservationRepository reservationRepository;
    public void save(Reservation reservation) {
        reservationRepository.save(reservation);
    }
}
