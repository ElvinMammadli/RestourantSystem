package com.example.Restourant.Model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.*;

@Entity
@Table
public class Restourant {

    public Restourant(){}

    public Restourant( String name, String password, Long reservationNumber) {

        this.name = name;
        this.password = password;
        this.reservationNumber = reservationNumber;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")
    private long id;

    @Column(name="name",unique = true)
    private String name;

    private String address;
    private String password;
    private long reservationNumber;

    public long getId   () {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Restourant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", reservationNumber='" + reservationNumber + '\'' +
                '}';
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

    public long getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(long reservationNumber) {
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
