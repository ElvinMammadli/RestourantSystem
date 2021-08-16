package com.example.Restourant.Controller;


import com.example.Restourant.Exception.RestourantNotFoundException;
import com.example.Restourant.Model.Restourant;
import com.example.Restourant.Service.RestourantService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestourantController {
    private static final Log LOG = LogFactory.getLog(UserController.class);


    @Autowired
    RestourantService restourantService;

    @PostMapping("/api/1.0/restourant")
    @ResponseStatus(HttpStatus.CREATED)
    public void CreateRestourant(@RequestBody Restourant restourant){
        restourantService.save(restourant);
    }

    @GetMapping("/api/1/restourant/{id}")
    public Restourant getRestourantById(@PathVariable  Long id){
        return restourantService.findById(id).orElseThrow(()
                        ->new RestourantNotFoundException("Restourant cant find")
                );
    }


    @GetMapping("/api/1/restourants")
    public List<Restourant> getRestourants(){
        return restourantService.findRestourants();
    }



}
