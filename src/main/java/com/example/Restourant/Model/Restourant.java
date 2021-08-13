package com.example.Restourant.Model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.*;

@Entity
@Table
public class Restourant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id",unique = true)
    private long id;

    @NotNull
    private String name;

    private String password;
    private String reservationNumber;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "restourant")
    private List<Reservation> reservations =new ArrayList<>();

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public long getId   () {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restourant that = (Restourant) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(password, that.password) && Objects.equals(reservationNumber, that.reservationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, reservationNumber);
    }
}
