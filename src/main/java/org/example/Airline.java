package org.example;

import org.example.Flight;

import java.util.ArrayList;import java.util.Scanner;

public class Airline {

    private ArrayList<Passenger> passengers;
    private ArrayList<Flight> flights;
    private String airlineName;

    public Airline(String airlineName) {
        this.airlineName = "easyJet";
        this.flights = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }


//    CUSTOM METHODS

    public void addAvailableFlight(Flight flight){
        flights.add(flight);
    }

    public void addNewPassenger(Passenger passenger){
        passengers.add(passenger);
    }


    public void removeFlight(Flight flight) {
        flights.remove(flight);
    }

}
