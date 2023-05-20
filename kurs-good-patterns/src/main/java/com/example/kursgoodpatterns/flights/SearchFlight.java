package com.example.kursgoodpatterns.flights;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SearchFlight implements FlightService {

    private final Map<String, List<Airport>> airPorts = new HashMap<>();

    public Map<String, List<Airport>> getAirports() {
        airPorts.put("Warsaw", List.of(new Airport("Berlin"), new Airport("Paris")));
        airPorts.put("Rome", List.of(new Airport("Dortmund"), new Airport("Munich"), new Airport("Warsaw")));
        airPorts.put("Athens", List.of(new Airport("Cracow"), new Airport("Wroclaw")));
        airPorts.put("Madrid", List.of(new Airport("Paris"), new Airport("Warsaw"), new Airport("Casablanca"), new Airport("New York")));
        airPorts.put("Berlin", List.of(new Airport("Cracow"), new Airport("Warsaw"), new Airport("Madrid"), new Airport("New York")));
        return airPorts;
    }


    @Override
    public void findAllFlightsFromCity(String city) {
        getAirports().entrySet().stream()
                .filter(a -> a.getKey().equals(city))
                .forEach(a -> System.out.println("you can fly from " + city + " to: " + a.getValue()));
    }

    @Override
    public void findAllFlightsToCity(String city) {
        String collect = getAirports().entrySet().stream()
                .filter(a -> a.getValue().stream().anyMatch(airport -> airport.getName().equals(city)))
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(", "));

        System.out.println("You can fly to: " + city + " from " + collect);
    }

    @Override
    public void findFlightByOtherCity(String fromCity, String byCity, String toCity) {
        Map<String, List<Airport>> airports = getAirports();

        List<String> foundFlights = airports.keySet().stream()
                .filter(airport -> airports.equals(byCity))
                .flatMap(airport -> airports.get(airport).stream())
                .filter(airport -> airports.containsKey(airport.getName()))
                .flatMap(airport -> airports.get(airport.getName()).stream())
                .filter(airport -> airport.getName().equals(toCity))
                .map(airport -> "Flight from " + fromCity + " to " + byCity + " with connection with " + airport.getName() + " to " + toCity)
                .toList();

        if (foundFlights.isEmpty()) {
            System.out.println("No flights found with the given cities");
        } else {
            System.out.println("Flights found by " + byCity + ":");
        }
    }
}
