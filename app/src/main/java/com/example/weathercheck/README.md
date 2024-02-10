# Weather Tracking App
The Weather Application is a simple application that fetches weather information for a given location and displays it to the user. 
- The Model is responsible for fetching and managing weather data, the View handles the user interface and interactions, and the Presenter acts as an intermediary, coordinating communication between the Model and View.

## MVP Architecture
### Model (WeatherModel)
Represents the weather data and business logic.
Fetches weather data from an external API (e.g., OpenWeatherMap).
Parses the JSON response from the API to extract relevant weather information.
Provides weather data to the Presenter.

### View (WeatherActivity)
Represents the user interface for the Weather Application.
Displays weather information to the user.
Handles user interactions, such as entering a location to fetch weather updates.
Implements the WeatherView interface, which defines methods for updating the UI with weather data and error messages.

### Presenter (WeatherPresenter)
Acts as an intermediary between the Model and View.
Receives requests for weather updates from the View.
Interacts with the Model to fetch weather data for the requested location.
Updates the View with the fetched weather information or error messages.
Implements the business logic for handling user interactions and updating the UI.

## Flow of Control
1) User Interaction:
The user interacts with the View (WeatherActivity) by entering a location and requesting weather updates.
The View forwards the user request to the Presenter (WeatherPresenter).

2) Presenter Interaction with Model:
The Presenter (WeatherPresenter) receives the user request and interacts with the Model (WeatherModel) to fetch weather data for the requested location.

3) Model Fetches Weather Data:
The Model (WeatherModel) fetches weather data from an external API (e.g., OpenWeatherMap) using HTTP requests.
It parses the JSON response from the API to extract relevant weather information.

4) Presenter Updates View:
Upon receiving the weather data from the Model, the Presenter (WeatherPresenter) updates the View (WeatherActivity) with the fetched weather information.
If there's an error during the data fetching process, the Presenter updates the View with an error message.

5) View Displays Weather Information:
The View (WeatherActivity) receives the weather data or error message from the Presenter and updates the UI accordingly.
It displays the weather information to the user or shows an error message if there was a problem fetching the data.
