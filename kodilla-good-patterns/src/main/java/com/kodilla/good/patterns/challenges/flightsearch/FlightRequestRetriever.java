package com.kodilla.good.patterns.challenges.flightsearch;

public class FlightRequestRetriever {
    public final FlightRequest retrieve() {
        FlightRequest allFlights = new FlightRequest();
        allFlights.addFlight(new Flight("Wroclaw", "Warszawa"));
        allFlights.addFlight(new Flight("Wroclaw","Katowice"));
        allFlights.addFlight(new Flight("Wroclaw","Poznan"));
        allFlights.addFlight(new Flight("Wroclaw","Krakow"));
        allFlights.addFlight(new Flight("Wroclaw","Gdansk"));
        allFlights.addFlight(new Flight("Wroclaw","Torun"));
        allFlights.addFlight(new Flight("Warszawa","Wroclaw"));
        allFlights.addFlight(new Flight("Warszawa","Katowice"));
        allFlights.addFlight(new Flight("Warszawa","Poznan"));
        allFlights.addFlight(new Flight("Warszawa","Krakow"));
        allFlights.addFlight(new Flight("Warszawa","Gdansk"));
        allFlights.addFlight(new Flight("Warszawa","Torun"));
        allFlights.addFlight(new Flight("Torun","Warszawa"));
        allFlights.addFlight(new Flight("Torun","Katowice"));
        allFlights.addFlight(new Flight("Torun","Poznan"));
        allFlights.addFlight(new Flight("Torun","Krakow"));
        allFlights.addFlight(new Flight("Torun","Gdansk"));
        allFlights.addFlight(new Flight("Torun","Wroclaw"));
        return allFlights;
    }
}
