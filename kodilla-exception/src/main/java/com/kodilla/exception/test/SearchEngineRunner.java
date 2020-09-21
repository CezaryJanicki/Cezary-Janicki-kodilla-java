package com.kodilla.exception.test;

public class SearchEngineRunner {
    public static void main(String[] args) {
        Flight flightFromWarsaw = new Flight("Warsaw", "Helsinki");

        SearchEngine searchEngine = new SearchEngine();

        try {
            searchEngine.findFlight(flightFromWarsaw);
        } catch (RouteNotFoundException e) {
            System.out.println("This flight does not exist. " + e);
        } finally {
            System.out.println("Thank you.");
        }

    }

}
