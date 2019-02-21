package com.springbootweatherapirestapplication.springbootweatherapirestapplication.controller;

import com.springbootweatherapirestapplication.springbootweatherapirestapplication.model.CurrentWeatherResponse;
import com.springbootweatherapirestapplication.springbootweatherapirestapplication.service.CurrentWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrentWeatherController {

    private CurrentWeatherService currentWeatherService;

    @Autowired
    public CurrentWeatherController(CurrentWeatherService currentWeatherService) {
        this.currentWeatherService = currentWeatherService;
    }

    @GetMapping("/cities-current-weather-responses")
    public ResponseEntity<CurrentWeatherResponse> retrieveCurrentWeatherByCityId(){

        ResponseEntity responseEntity = null;

        CurrentWeatherResponse currentWeatherResponse = currentWeatherService.retrieveCurrentWeather();

        responseEntity = new ResponseEntity<>(currentWeatherResponse, HttpStatus.OK);

        return responseEntity;
    }


}
