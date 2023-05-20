package com.example.kursgoodpatterns.flights;

public interface FlightService {

    void findAllFlightsFromCity(String city);

    void findAllFlightsToCity(String city);

    void findFlightByOtherCity(String fromCity, String byCity, String toCity);

}
