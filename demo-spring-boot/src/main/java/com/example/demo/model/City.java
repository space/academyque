package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class City {
    
    private Long id;

    private String country;
    private String name;
    private Integer latitude;
    private Integer longitude;
    private Temperature temperature;
    
}
