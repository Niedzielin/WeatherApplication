package com.sda.weatherapp.backend;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Optional;

/**
 * Created by Hyperbook on 30.01.2021
 **/
@Entity
@Data
@NoArgsConstructor
public class Location {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private float latitude;
    private float longitude;
    private String region;
    private String country;

    public Location(String city, float latitude, float longitude, String region, String country) {
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
        this.region = region;
        this.country = country;
    }

    public Optional<String> getRegion(){
        return Optional.ofNullable(region);
    }
}
