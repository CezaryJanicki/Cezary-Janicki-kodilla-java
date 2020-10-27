package com.kodilla.good.patterns.challenges.flightsearch;

public class Application {
    public static void main(String[] ars) {

        FlightsRepository flightsRepository = new FlightsRepository();

        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(flightsRepository.getAllFlights());
        flightSearchEngine.searchByFlightArrival("Warszawa");
        flightSearchEngine.searchByFlightDeparture("Warszawa");
        flightSearchEngine.searchByFlightConnection("Wroclaw", "Torun", "Katowice");
        flightSearchEngine.searchByFlightConnection("Wroclaw", "Katowice", "Torun");
    }
}
