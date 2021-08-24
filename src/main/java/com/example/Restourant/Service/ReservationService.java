package com.example.Restourant.Service;

import com.example.Restourant.Exception.ReservationNotFoundException;
import com.example.Restourant.Model.Reservation;
import com.example.Restourant.Repository.ReservationRepository;
import com.example.Restourant.Repository.RestourantRepository;
import com.example.Restourant.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    ReservationRepository reservationRepository;
    RestourantRepository restourantRepository;
    UserRepository userRepository;

    public ReservationService(ReservationRepository reservationRepository,RestourantRepository restourantRepository
            ,UserRepository userRepository){
        this.reservationRepository = reservationRepository;
        this.restourantRepository= restourantRepository;
        this.userRepository=userRepository;
    }


    public List<Reservation> getReservations() {
        List<Reservation> reservations =reservationRepository.findAll();
        if(reservations==null){
            throw new ReservationNotFoundException("You haven't got any reservation yet");
        }
        else return reservationRepository.findAll();
    }

    public List<Reservation> getReservationsByUserId(Long id){
        List<Reservation> reservations =reservationRepository.findAll();
        if(reservations==null){
            throw new ReservationNotFoundException("You haven't got any reservation yet");
        }
        else return reservationRepository.findAllByUserId(id);

    }

    public void createReservation(Reservation reservation){
        reservationRepository.save(reservation);
    }

    public void deleteReservation(Long id){
        reservationRepository.deleteById(id);
    }

    public Optional<Reservation> getReservationById(Long id){
        return reservationRepository.findById(id);
    }
}

