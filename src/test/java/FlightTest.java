//package org.example.Flight;

    import org.example.Flight;
    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.Test;

    import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class FlightTest {

    Flight flight;

    @BeforeEach
    public void setup() {
        flight = new Flight("London", 1);
    }


    @Test
    public void canGetDestination() {
        assertThat(flight.getDestination()).isEqualTo("London");
    }

    @Test
    public void canGetFlightID() {
        assertThat(flight.getFlightID()).isEqualTo(1);
    }

    @Test
    public void canGetPassengerNumber() {
        assertThat(flight.getPassengerNumber()).isEqualTo(0);
    }

    @Test
    public void canGetCollectionOfPassengers() {
        assertThat(flight.getCollectionOfPassengers().size()).isEqualTo(0);
    };


}
