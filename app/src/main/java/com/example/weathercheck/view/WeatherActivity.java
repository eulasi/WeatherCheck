package com.example.weathercheck.view;

import com.example.weathercheck.model.WeatherModel;
import com.example.weathercheck.presenter.WeatherPresenter;

/**
 The WeatherActivity class implements the WeatherView interface. It is responsible for displaying the weather data to the user.
 **/

public class WeatherActivity implements WeatherView {
    private WeatherPresenter presenter;
    public void setPresenter(WeatherPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void displayWeather(WeatherModel weather) {

    }

    @Override
    public void displayError(String message) {

    }
}
