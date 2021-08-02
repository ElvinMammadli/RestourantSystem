package com.example.Restourant.Controller;


import com.example.Restourant.Model.Restourant;
import com.example.Restourant.Service.RestourantService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestourantController {

    RestourantService restourantService;

    @PostMapping("api/1.0/Restourant")
    public void CreateRestourant(@RequestBody Restourant restourant){
        restourantService.save(restourant);
    }
}
