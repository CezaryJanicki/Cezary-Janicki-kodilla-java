package com.kodilla.good.patterns.challenges.flightsearch;

public class Application {
    public static void main(String[] ars) {

        FlightsRepository flightsRepository = new FlightsRepository();

        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(flightsRepository.getAllFlights());

        System.out.println("Searching all Flights by arrival to: Warszawa");
        flightSearchEngine.searchByFlightArrival("Warszawa").stream().forEach(System.out::println);

        System.out.println("Searching all Flights by departure from: Warszawa");
        flightSearchEngine.searchByFlightDeparture("Warszawa").stream().forEach(System.out::println);

        System.out.println("Searching all Flights departing from: Wroclaw arriving to: Torun with change in: Katowice");
        flightSearchEngine.searchByFlightConnection("Wroclaw", "Torun", "Katowice").stream().forEach(System.out::println);

        System.out.println("Searching all Flights departing from: Wroclaw arriving to: Katowice with change in: Torun");
        flightSearchEngine.searchByFlightConnection("Wroclaw", "Katowice", "Torun").stream().forEach(System.out::println);
    }
}
