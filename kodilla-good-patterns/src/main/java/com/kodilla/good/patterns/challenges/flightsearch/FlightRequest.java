package com.kodilla.good.patterns.challenges.flightsearch;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FlightRequest {
   private final Set<Flight> allFlights = new HashSet<Flight>();

    public Boolean addFlight(Flight flight) {
        allFlights.add(flight);
        return true;
    }

    public Set<Flight> getAllFlights() {
        return Collections.unmodifiableSet(allFlights);
    }
}


