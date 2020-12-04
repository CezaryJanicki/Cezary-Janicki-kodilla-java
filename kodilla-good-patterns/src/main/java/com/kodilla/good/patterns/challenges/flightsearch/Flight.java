package com.kodilla.good.patterns.challenges.flightsearch;

public class Flight {
    private final String departure;
    private final String arrival;
    private final int flightNumber;

    public Flight(String departure, String arrival, int flightNumber) {
        this.departure = departure;
        this.arrival = arrival;
        this.flightNumber = flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (flightNumber != flight.flightNumber) return false;
        if (!departure.equals(flight.departure)) return false;
        return arrival.equals(flight.arrival);
    }

    @Override
    public int hashCode() {
        int result = departure.hashCode();
        result = 31 * result + arrival.hashCode();
        result = 31 * result + flightNumber;
        return result;
    }

    @Override
    public String toString() {
        return "Flight has the following conditions:" +
                "departure Airport is: " + departure +
                " arrival Airport is: " + arrival +
                " flight number is: " + flightNumber + "\n";
    }
}
