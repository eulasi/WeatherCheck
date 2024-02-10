package com.example.weathercheck.presenter;

import com.example.weathercheck.model.WeatherModel;
import com.example.weathercheck.model.WeatherRepository;
import com.example.weathercheck.view.WeatherView;

/**
  The WeatherPresenter is responsible for retrieving the weather data from the WeatherRepository. It then passes the data to the WeatherView. It also handles any errors that may occur.
 **/

public class WeatherPresenter {
    // The WeatherView is the view that displays the weather data.
    private WeatherView view;
    // The WeatherRepository is the repository that retrieves the weather data.
    private WeatherRepository repository;
    // The WeatherPresenter is the presenter that handles the weather data.
    public WeatherPresenter(WeatherView view, WeatherRepository repository) {
        this.view = view;
        this.repository = repository;
    }
    // The getWeather method retrieves the weather data from the WeatherRepository and passes it to the WeatherView.
    public void getWeather(String city) {
        WeatherModel weather = repository.getWeather(city);
        if (weather != null) {
            view.displayWeather(weather);
        } else {
            view.displayError("Failed to retrieve weather data for " + city);
        }
    }
}
