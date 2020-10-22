package com.kodilla.good.patterns.challenges.flightsearch;

public class Application {
    public static void main(String[] ars) {

        FlightRequestRetriever flightRequestRetriever = new FlightRequestRetriever();
        FlightRequest allFlights = flightRequestRetriever.retrieve();

        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(allFlights.getAllFlights());
        flightSearchEngine.searchByFlightArrival("Warszawa");
        flightSearchEngine.searchByFlightDeparture("Warszawa");
        flightSearchEngine.searchByFlightConnection("Wroclaw", "Torun", "Katowice");
        flightSearchEngine.searchByFlightConnection("Wroclaw", "Katowice", "Torun");
    }
}
