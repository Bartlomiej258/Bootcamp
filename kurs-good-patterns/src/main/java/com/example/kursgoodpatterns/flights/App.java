package com.example.kursgoodpatterns.flights;

public class App {
    public static void main(String[] args) {

        SearchFlight searchFlight = new SearchFlight();

        searchFlight.findAllFlightsFromCity("Warsaw");
        searchFlight.findAllFlightsToCity("Warsaw");
        searchFlight.findFlightByOtherCity("Warsaw", "Berlin", "Madrid");
    }
}
