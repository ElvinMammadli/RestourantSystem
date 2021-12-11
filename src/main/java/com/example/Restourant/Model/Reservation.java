package com.example.Restourant.Model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Reservation {


    public Reservation(){}

    public Reservation(String date, Restourant restourant, User user) {

        this.date=date;
        this.restourant = restourant;
        this.user = user;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")
    private long id;

    @Column(name="date")
    private String date;



    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY,targetEntity=Restourant.class,cascade = CascadeType.MERGE)
    @JoinColumn(name = "USER_ID",referencedColumnName = "id")
    private Restourant restourant;


    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY,targetEntity = User.class,cascade = CascadeType.MERGE)
    @JoinColumn(name = "RESTOURANT_ID",referencedColumnName = "id")
    private User user;

    public Restourant getRestourant() {
        return restourant;
    }

    public void setRestourant(Restourant restourant) {
        this.restourant = restourant;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return id == that.id && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date);
    }
}
