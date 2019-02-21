package com.springbootweatherapirestapplication.springbootweatherapirestapplication.service;

import com.springbootweatherapirestapplication.springbootweatherapirestapplication.client.WeatherApiClient;
import com.springbootweatherapirestapplication.springbootweatherapirestapplication.model.CurrentWeatherResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CurrentWeatherService {

    private WeatherApiClient weatherApiClient;

    @Autowired
    public CurrentWeatherService(WeatherApiClient weatherApiClient) {
        this.weatherApiClient = weatherApiClient;
    }

    public CurrentWeatherResponse retrieveCurrentWeather(){

        CurrentWeatherResponse currentWeatherResponse = new CurrentWeatherResponse();

        try {

            currentWeatherResponse = weatherApiClient.retrieveCurrentWeather();

        } catch(Exception e){
            currentWeatherResponse.setErrorMessage(true);
            log.info("Error in retrieveCurrentWeather: " + e.getMessage());
        }

        return currentWeatherResponse;
    }
}
