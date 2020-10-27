package com.kodilla.good.patterns.challenges.flightsearch;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FlightsRepository {
    public Set<Flight> getAllFlights() {
        Set<Flight> allFlights = new HashSet<>();
        allFlights.add(new Flight("Wroclaw", "Warszawa"));
        allFlights.add(new Flight("Wroclaw","Katowice"));
        allFlights.add(new Flight("Wroclaw","Poznan"));
        allFlights.add(new Flight("Wroclaw","Krakow"));
        allFlights.add(new Flight("Wroclaw","Gdansk"));
        allFlights.add(new Flight("Wroclaw","Torun"));
        allFlights.add(new Flight("Warszawa","Wroclaw"));
        allFlights.add(new Flight("Warszawa","Katowice"));
        allFlights.add(new Flight("Warszawa","Poznan"));
        allFlights.add(new Flight("Warszawa","Krakow"));
        allFlights.add(new Flight("Warszawa","Gdansk"));
        allFlights.add(new Flight("Warszawa","Torun"));
        allFlights.add(new Flight("Torun","Warszawa"));
        allFlights.add(new Flight("Torun","Katowice"));
        allFlights.add(new Flight("Torun","Poznan"));
        allFlights.add(new Flight("Torun","Krakow"));
        allFlights.add(new Flight("Torun","Gdansk"));
        allFlights.add(new Flight("Torun","Wroclaw"));
        return Collections.unmodifiableSet(allFlights);
    }
}
