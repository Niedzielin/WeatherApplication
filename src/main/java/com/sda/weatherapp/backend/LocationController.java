package com.sda.weatherapp.backend;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by Hyperbook on 30.01.2021
 **/
public class LocationController {
    private final ObjectMapper objectMapper;
    private final LocationService locationService;
    private final LocationMapper locationMapper;
}
