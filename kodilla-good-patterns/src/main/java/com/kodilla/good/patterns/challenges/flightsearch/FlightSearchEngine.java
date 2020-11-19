package com.kodilla.good.patterns.challenges.flightsearch;

import java.util.*;
import java.util.stream.Collectors;

public class FlightSearchEngine {

    private Set<Flight> listOfFlights;

    public FlightSearchEngine(Set<Flight> listOfFlights) {
        this.listOfFlights = listOfFlights;
    }

    public List<FlightSearchResult> searchByFlightDeparture(String departure) {
        System.out.println("Searching all Flights by departure from: " + departure);

        return listOfFlights.stream()
                .filter(dep -> dep.getDeparture().equals(departure))
                .peek(System.out::println)
                .map(FlightSearchResult::new)
                .collect(Collectors.toList());
    }

    public List<FlightSearchResult> searchByFlightArrival(String arrival) {
        System.out.println("Searching all Flights by arrival to: " + arrival);

        return listOfFlights.stream()
                .filter(arr -> arr.getArrival().equals(arrival))
                .peek(System.out::println)
                .map(FlightSearchResult::new)
                .collect(Collectors.toList());
    }

    public List<Flight> searchByFlightConnection(String departure, String arrival, String through) {
        System.out.println("Searching all Flights departing from: " + departure + " arriving to: " + arrival + " with change in: " + through);

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
            System.out.println("There is a connecting flight from " + departure + " to " + arrival + " with a stop/change in " + through);
            listOfFlightsWithInterChange.stream()
                    .forEach(System.out::println);
            return listOfFlightsWithInterChange;
        } else {
            System.out.println("There is no connection from " + departure + " to " + arrival + " with a stop/change in " + through);
            return Collections.emptyList();
        }
    }
}
