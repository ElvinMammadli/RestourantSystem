package com.example.Restourant.Controller;


import com.example.Restourant.Model.Restourant;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestourantController {
    @PostMapping("api/1.0/Restourant")
    public void CreateRestourant(@RequestBody Restourant restourant){

    }
}
