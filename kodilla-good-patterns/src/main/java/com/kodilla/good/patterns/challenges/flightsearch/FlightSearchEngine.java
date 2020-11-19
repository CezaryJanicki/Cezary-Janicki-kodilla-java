package com.kodilla.good.patterns.challenges.flightsearch;

import java.util.*;
import java.util.stream.Collectors;

public class FlightSearchEngine {

    private Set<Flight> listOfFlights;

    public FlightSearchEngine(Set<Flight> listOfFlights) {
        this.listOfFlights = listOfFlights;
    }

    public List<FlightSearchResult> searchByFlightDeparture(String departure) {
        return listOfFlights.stream()
                .filter(dep -> dep.getDeparture().equals(departure))
                .map(FlightSearchResult::new)
                .collect(Collectors.toList());
    }

    public List<FlightSearchResult> searchByFlightArrival(String arrival) {
        return listOfFlights.stream()
                .filter(arr -> arr.getArrival().equals(arrival))
                .map(FlightSearchResult::new)
                .collect(Collectors.toList());
    }

    public List<Flight> searchByFlightConnection(String departure, String arrival, String through) {

        Set<Flight> departureAirport = listOfFlights.stream()
                .filter(dep -> dep.getDeparture().equals(departure))
                .collect(Collectors.toSet());

        Set<Flight> arrivalAirport = listOfFlights.stream()
                .filter(arr -> arr.getArrival().equals(arrival))
                .collect(Collectors.toSet());

        List<Flight> listOfFlightsWithInterChange = listOfFlights.stream()
                .filter(f -> f.getDeparture().equals(departure) && f.getArrival().equals(through))
                .collect(Collectors.toList());
        listOfFlights.stream()
                .filter(f -> f.getDeparture().equals(through) && f.getArrival().equals(arrival))
                .collect(Collectors.toCollection(() -> listOfFlightsWithInterChange));

        if ((departureAirport.stream().anyMatch(e -> e.getArrival().equals(through)))
                && (arrivalAirport.stream().anyMatch(e -> e.getDeparture().equals(through)))) {
            return listOfFlightsWithInterChange;
        } else {
            return Collections.emptyList();
        }
    }
}
