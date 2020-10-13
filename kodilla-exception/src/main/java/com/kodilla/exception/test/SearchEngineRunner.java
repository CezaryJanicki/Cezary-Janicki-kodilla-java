package com.kodilla.exception.test;

public class SearchEngineRunner {
    public static void main(String[] args) {
        Flight flightFromWarsaw = new Flight("Warsaw", "Moscow");

        SearchEngine searchEngine = new SearchEngine();

        try {
            if (searchEngine.findFlight(flightFromWarsaw)) {
                System.out.println("The flight has been found.");
            } else {
                System.out.println("The flight has not been found.");
            }

        } catch (RouteNotFoundException e) {
            System.out.println("Please provide the correct name of the airport. " + e);
        } finally {
            System.out.println("Thank you.");
        }

    }

}
