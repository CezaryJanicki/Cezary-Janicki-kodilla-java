package com.kodilla.good.patterns.challenges.flightsearch;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FlightsRepository {
    public Set<Flight> getAllFlights() {
        Set<Flight> allFlights = new HashSet<>();
        allFlights.add(new Flight("Wroclaw", "Warszawa", 11));
        allFlights.add(new Flight("Wroclaw","Katowice", 12));
        allFlights.add(new Flight("Wroclaw","Poznan", 12));
        allFlights.add(new Flight("Wroclaw","Krakow", 11));
        allFlights.add(new Flight("Wroclaw","Gdansk", 13));
        allFlights.add(new Flight("Wroclaw","Torun", 12));
        allFlights.add(new Flight("Warszawa","Wroclaw", 13));
        allFlights.add(new Flight("Warszawa","Katowice", 14));
        allFlights.add(new Flight("Warszawa","Poznan", 21));
        allFlights.add(new Flight("Warszawa","Krakow", 22));
        allFlights.add(new Flight("Warszawa","Gdansk", 21));
        allFlights.add(new Flight("Warszawa","Torun", 12));
        allFlights.add(new Flight("Torun","Warszawa", 12));
        allFlights.add(new Flight("Torun","Katowice", 23));
        allFlights.add(new Flight("Torun","Poznan", 23));
        allFlights.add(new Flight("Torun","Krakow", 12));
        allFlights.add(new Flight("Torun","Gdansk", 12));
        allFlights.add(new Flight("Torun","Wroclaw", 12));
        allFlights.add(new Flight("Wroclaw", "Torun", 432));
        allFlights.add(new Flight("Torun", "Katowice", 4532));
        return Collections.unmodifiableSet(allFlights);
    }
}
