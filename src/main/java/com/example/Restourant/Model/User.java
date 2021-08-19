package com.example.Restourant.Model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="User")

public class User {

    public User(){}

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", appUserRole=" + appUserRole +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", ispresent=" + ispresent +
                '}';
    }

    public User(AppUserRole appUserRole, String password, String username, boolean ispresent) {
        this.appUserRole = appUserRole;
        this.password = password;
        this.username = username;
        this.ispresent = ispresent;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;



    @Enumerated(EnumType.STRING)
    private AppUserRole appUserRole;

    private String password;

    private String username;



    private boolean ispresent = false;

    public boolean isIspresent() {
        return ispresent;
    }

    public void setIspresent(boolean ispresent) {
        this.ispresent = ispresent;
    }


    public AppUserRole getAppUserRole() {
        return appUserRole;
    }

    public void setAppUserRole(AppUserRole appUserRole) {
        this.appUserRole = appUserRole;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(username, user.username) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password);
    }


}
