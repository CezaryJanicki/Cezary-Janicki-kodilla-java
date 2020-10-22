package com.kodilla.good.patterns.challenges.flightsearch;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearchEngine {

    private Set<Flight> listOfFlights;

    public FlightSearchEngine(Set<Flight> listOfFlights) {
        this.listOfFlights = listOfFlights;
    }

    public Set<Flight> searchByFlightDeparture(String departure) {
        System.out.println("Searching all Flights by departure from: " + departure);
        listOfFlights.stream()
                .filter(dep -> dep.getDeparture().equals(departure))
                .forEach(System.out::println);
        return listOfFlights.stream()
                .filter(dep -> dep.getArrival().equals(departure))
                .collect(Collectors.toSet());
    }

    public Set<Flight> searchByFlightArrival(String arrival) {
        System.out.println("Searching all Flights by arrival to: " + arrival);
        listOfFlights.stream()
                .filter(arr -> arr.getArrival().equals(arrival))
                .map(string -> string.toString())
                .forEach(System.out::println);
        return listOfFlights.stream()
                .filter(arr -> arr.getArrival().equals(arrival))
                .collect(Collectors.toSet());
    }

    public void searchByFlightConnection(String departure, String arrival, String through) {
        System.out.println("Searching all Flights departing from: " + departure + " arriving to: " + arrival + " with change in: " + through);

        Set<Flight> departureAirport = listOfFlights.stream()
                .filter(dep -> dep.getDeparture().equals(departure))
                .collect(Collectors.toSet());

        Set<Flight> arrivalAirport = listOfFlights.stream()
                .filter(arr -> arr.getArrival().equals(arrival))
                .collect(Collectors.toSet());

        if ((departureAirport.stream().anyMatch(e -> e.getArrival().equals(through)))
            && (arrivalAirport.stream().anyMatch(e -> e.getDeparture().equals(through)))) {
            System.out.println("There is a connecting flight from " + departure + " to " + arrival + " with a stop/change in " + through);
            } else {
            System.out.println("There is no connection from " + departure + " to " + arrival + " with a stop/change in " + through);
        }
    }
}
