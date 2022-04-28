package com.example.demo.contollers;

import java.util.Collection;
import java.util.List;

import com.example.demo.model.City;
import com.example.demo.services.MyCityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @Autowired
    private MyCityService myCityService;
    
    @GetMapping("/cities")
    public Collection<City> citiesCollectionEndPoint() {
        System.out.println("Invocato endpoint...");
        return myCityService.findAll();
    }

    @GetMapping("/cities/{id}")
    public City cityElementEndPoint(@PathVariable Integer id) {
        return myCityService.findById(id);
    }

}
