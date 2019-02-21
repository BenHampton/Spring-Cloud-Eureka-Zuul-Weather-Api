package com.springbootweatherapirestapplication.springbootweatherapirestapplication.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class CurrentWeatherResponse {

    private List<Weather> weather = new ArrayList<>();

    @JsonProperty("main")
    private Temperature temperature;

    @JsonProperty("sys")
    private Sun sun;

    private boolean errorMessage;
}
