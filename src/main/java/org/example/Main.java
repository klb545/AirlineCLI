package org.example;

    import java.util.ArrayList;
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Collection of available flights
        Airline airline = new Airline("easyJet");
        airline.addAvailableFlight(new Flight("Germany", 1));
        airline.addAvailableFlight(new Flight("France", 2));
        airline.addAvailableFlight(new Flight("Italy", 3));


        boolean run = false;

        while (!run) {
            System.out.println("What you would you like to do?");

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.equals("add a flight")) {
                System.out.println("Enter Destination");
                String destination = scanner.nextLine();
                Flight flight = new Flight(destination, 5);
                airline.addAvailableFlight(flight);
                System.out.println("Flight added");

            } else if (input.equals("display all available flights")) {
                for (Flight flight : airline.getFlights()) {
                    System.out.println("Destination: " + flight.getDestination() + ". Flight ID: " + flight.getFlightID() + ". Passengers: " + flight.getPassengerNumber());

                }
            } else if (input.equals("add a new passenger")) {
                    System.out.println("Enter Passenger Name");
                    String name = scanner.nextLine();
                    System.out.println("Enter Passenger email");
                    String email = scanner.nextLine();
                    Passenger passenger = new Passenger(name, email, 1);
                    airline.addNewPassenger(passenger);
                    System.out.println("Passenger added");

            } else if(input.equals("book a passenger on to a flight")) {
//                1) check if user input for flight id actually matches that of an available flight
//                2) get the flight with that id and save it to a variable e.g. flightToBookPassengerOnto
//                3) check if user input for passenger id actually matches that of an available passenger
//                4) get the passenger with that id and save it to a variable e.g. passengerToBookOntoFlight
//                5) call method: flightToBookPassengerOnto.bookPassengerOntoFlight(passengerToBookOntoFlight);

                Flight flightToBookPassengerOnto = null;
                Passenger passengerToBookOntoFlight = null;
//                STEPS 1 & 2
                System.out.println("Enter flight ID");
                int flightID = scanner.nextInt();
                for(int i = 0; i < airline.getFlights().size(); i++) {
                    if (airline.getFlights().get(i).getFlightID() != flightID) {
                        System.out.println("Please enter ID of an available flight");
                    } else if (airline.getFlights().get(i).getFlightID() == flightID){
                        System.out.println("Flight found");
                        flightToBookPassengerOnto = airline.getFlights().get(i);
                    }
                }
//                STEPS 3 & 4
                System.out.println("Enter passenger ID");
                int passengerID = scanner.nextInt();
                for(int i = 0; i < airline.getPassengers().size(); i++) {
                    if (airline.getPassengers().get(i).getUniqueIdentifier() != passengerID) {
                        System.out.println("Please enter ID of a passenger you've added");
                    } else if (airline.getPassengers().get(i).getUniqueIdentifier() == passengerID){
                        System.out.println("Passenger found");
                        passengerToBookOntoFlight = airline.getPassengers().get(i);
                    }
                }
//                STEP 5
                flightToBookPassengerOnto.bookPassengerOntoFlight(passengerToBookOntoFlight);

            } else if(input.equals("cancel flight")) {
                System.out.println("Enter flight ID");
                int flightID = scanner.nextInt();
                for(int i = 0; i < airline.getFlights().size(); i++) {
                    if (airline.getFlights().get(i).getFlightID() != flightID) {
                        System.out.println("Please enter ID of an available flight");
                    } else if (airline.getFlights().get(i).getFlightID() == flightID) {
                        System.out.println("Flight found");
                        airline.removeFlight(airline.getFlights().get(i));

                    }
                }
            } else if (input.equals("quit")) {
                    run = true;
                    break;
            }

        }

    }
}


