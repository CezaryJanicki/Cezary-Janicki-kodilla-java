package com.kodilla.good.patterns.challenges.flightsearch;

import java.util.ArrayList;
import java.util.List;

public class FlightSearchResult {
    private final List<Flight> connections;

    public FlightSearchResult(List<Flight> connections) {
        this.connections = connections;
    }

    public FlightSearchResult(Flight flight) {
        this.connections = new ArrayList<>();
        this.connections.add(flight);
    }

    public List<Flight> getConnections() {
        return connections;
    }

    public boolean isDirectFlight() {
        return connections.size() == 1;
    }

    @Override
    public String toString() {
        return "FlightSearchResult{" +
                "connections=" + connections +
                '}';
    }
}
