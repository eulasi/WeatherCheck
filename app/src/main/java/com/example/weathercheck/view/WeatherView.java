package com.example.weathercheck.view;

import com.example.weathercheck.model.WeatherModel;

/**
 The WeatherView interface defines the methods that the WeatherActivity implements like displaying weather data or error messages.
 **/

public interface WeatherView {
    void displayWeather(WeatherModel weather);
    void displayError(String message);

}


