package com.example.weathercheck;

import com.example.weathercheck.model.WeatherModel;
import com.example.weathercheck.model.WeatherRepository;
import com.example.weathercheck.presenter.WeatherPresenter;
import com.example.weathercheck.view.WeatherActivity;
import com.example.weathercheck.view.WeatherView;

/**
 * The Main class is the entry point of the application. It creates an instance of the WeatherView, WeatherRepository, and WeatherPresenter.
 **/

public class Main {
    public static void main(String[] args) {
        // Create a new instance of the WeatherView
        WeatherView weatherView = new WeatherView() {
            @Override
            public void displayWeather(WeatherModel weather) {
            }

            @Override
            public void displayError(String message) {
            }
        };
        // Create a new instance of the WeatherRepository
        WeatherRepository weatherRepository = new WeatherRepository();
        // Create a new instance of the WeatherPresenter
        WeatherPresenter weatherPresenter = new WeatherPresenter(weatherView, weatherRepository);
        // Set the presenter on the view
        ((WeatherActivity) weatherView).setPresenter(weatherPresenter);

        weatherPresenter.getWeather("Atlanta");
    }
}
