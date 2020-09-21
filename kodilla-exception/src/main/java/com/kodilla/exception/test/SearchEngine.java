package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchEngine {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

    Map<String, Boolean> arrivalAirportAvailable = new HashMap<String,Boolean>();
        arrivalAirportAvailable.put("Moscow", true);
        arrivalAirportAvailable.put("Warsaw", false);

        Boolean flightAvailable = arrivalAirportAvailable.get(flight.getArrivalAirport());

        if (flightAvailable == null) {
            throw new RouteNotFoundException("The route from " + flight + " has not been found.");
        }
        return flightAvailable;
    }
}