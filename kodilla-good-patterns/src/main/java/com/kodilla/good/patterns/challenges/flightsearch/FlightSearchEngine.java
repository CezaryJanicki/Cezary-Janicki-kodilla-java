package com.kodilla.good.patterns.challenges.flightsearch;

import java.util.*;
import java.util.function.Predicate;
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

    public List<FlightSearchResult> searchByFlightConnection(String departure, String arrival, String through) {

        return listOfFlights.stream()
                .filter(isConnectionFromTo(departure, through))
                .flatMap(firstConnection -> listOfFlights.stream()
                    .filter(isConnectionFromTo(through, arrival))
                    .map(secondConnection -> createListOfConnectedFlights(firstConnection, secondConnection)))
                .map(FlightSearchResult::new)
                .collect(Collectors.toList());
    }

    private List<Flight> createListOfConnectedFlights(Flight firstConnection, Flight secondConnection) {
        List<Flight> flights = new ArrayList<>();
        flights.add(firstConnection);
        flights.add(secondConnection);
        return flights;
    }

    private Predicate<Flight> isConnectionFromTo(String departure, String through) {
        return dep -> dep.getDeparture().equals(departure) && dep.getArrival().equals(through);
    }
}
