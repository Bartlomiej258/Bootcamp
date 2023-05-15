package com.kurs.exception.kursexception.test;

import java.util.ArrayList;
import java.util.List;

public class FlightRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Warsaw", "Moscow");
        Flight flight2 = new Flight("Washington", "Warsaw");
        Flight flight3= new Flight("Berlin", "Sofia");


        FlightSearch flightSearch = new FlightSearch();
        try {
            flightSearch.findAirport(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("Can not find airport");
        }
    }
}
