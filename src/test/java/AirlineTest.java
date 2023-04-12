import org.example.Airline;
import org.example.Flight;
import org.example.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AirlineTest {

    Airline airline;
    @BeforeEach
    public void setUp(){
//        passengers
        airline.addNewPassenger(new Passenger("Dave", "dave@gmail.com", 1));
//        flights
        airline.addAvailableFlight(new Flight("Germany", 1));
    }

//    @Test
//    public void get(){
//        assertThat(airline.getPassengers()).isEqualTo("");
//    }


//    @Test
//    public void canGetPassengers() {
//        assertThat(airline.getPassengers().size()).isEqualTo(0);
//    };

}
