package com.kurs.exception.kursexception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public Map<String, Boolean> findFlight() {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("Berlin", true);
        airports.put("Washington", true);
        airports.put("Sofia", true);
        airports.put("Moscow", false);

        return airports;
    }

    public void findAirport(Flight flight) throws RouteNotFoundException {
        if (flight.getArrivalAirport().equals(flight.getDepartureAirport())) {
            throw new RouteNotFoundException();
        }

        if (findFlight().containsKey(flight.getArrivalAirport()) && findFlight().containsKey(flight.getDepartureAirport())
        && findFlight().get(flight.getArrivalAirport()) && findFlight().get(flight.getDepartureAirport())) {
            System.out.println("You can fly to: " + flight.getDepartureAirport() + " from: " + flight.getArrivalAirport());
        } else {
            System.out.println("Sorry you can not fly to: " + flight.getDepartureAirport() + " to: " + flight.getArrivalAirport() + " " + RouteNotFoundException.class);
        }
    }

}
