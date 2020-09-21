package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchEngine {

    public void findFlight(Flight flight) throws RouteNotFoundException {

    Map<String, Boolean> airportList = new HashMap<String,Boolean>();
        airportList.put("Moscow", true);
        airportList.put("Warsaw", false);

        for (Map.Entry<String, Boolean> entry : airportList.entrySet()) {
            if (flight.getDepartureAirport().equals(entry.getKey())) {
                System.out.println("The airport " + entry.toString() + " has been found in the database.");
            } else {
                throw new RouteNotFoundException("The route from " + flight + " has not been found.");
            }
        }
    }
}