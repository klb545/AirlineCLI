package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Flight {

    private String destination;
    private int flightID;
    private int passengerNumber;
    private ArrayList<Passenger> collectionOfPassengers;

    public Flight(String destination, int flightID) {
        this.destination = destination;
        this.flightID = flightID;
        this.passengerNumber = 0;
        this.collectionOfPassengers = new ArrayList<>();
    }

//    GETTERS & SETTERS


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightID() {
        return flightID;
    }

    public void setFlightID(int flightID) {
        this.flightID = flightID;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public ArrayList<Passenger> getCollectionOfPassengers() {
        return collectionOfPassengers;
    }

    public void setCollectionOfPassengers(ArrayList<Passenger> collectionOfPassengers) {
        this.collectionOfPassengers = collectionOfPassengers;
    }


//  CUSTOM METHODS

    public void bookPassengerOntoFlight(Passenger passenger){
        collectionOfPassengers.add(passenger);
        this.passengerNumber++;
    }
    

}
