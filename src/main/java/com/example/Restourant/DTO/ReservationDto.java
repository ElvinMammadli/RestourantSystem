package com.example.Restourant.DTO;

public class ReservationDto {
    private String id;
    private Long user_id;
    private Long restourant_id;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getRestourant_id() {
        return restourant_id;
    }

    public void setRestourant_id(Long restourant_id) {
        this.restourant_id = restourant_id;
    }
}
