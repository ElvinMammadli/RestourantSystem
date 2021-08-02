package com.example.Restourant.Controller;


import com.example.Restourant.Model.Restourant;
import com.example.Restourant.Service.RestourantService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestourantController {
    private static final Log LOG = LogFactory.getLog(UserController.class);


    @Autowired
    RestourantService restourantService;

    @PostMapping("api/1.0/restourant")
    public void CreateRestourant(@RequestBody Restourant restourant){
        restourantService.save(restourant);
        LOG.info(restourant.getName());

    }
}
