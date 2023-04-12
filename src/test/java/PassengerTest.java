import org.example.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PassengerTest {

    Passenger passenger;

    @BeforeEach
    public void setUp(){
       passenger = new Passenger("Dave", "dave@gmail.com", 1);
    }

    @Test
    public void canGetName(){
        assertThat(passenger.getName()).isEqualTo("Dave");
    }

    @Test
    public void canGetFlightID(){
        assertThat(passenger.getEmail()).isEqualTo("dave@gmail.com");
    }

    @Test
    public void canGetUniqueIdentifier(){
        assertThat(passenger.getUniqueIdentifier()).isEqualTo(1);
    }

    @Test
    public void canSetName(){
        passenger.setName("Katie");
        assertThat(passenger.getName()).isEqualTo("Katie");
    }

    @Test
    public void canSetEmail(){
        passenger.setEmail("katie@gmail.com");
        assertThat(passenger.getEmail()).isEqualTo("katie@gmail.com");
    }

    @Test
    public void canSetUniqueIdentifier(){
        passenger.setUniqueIdentifier(2);
        assertThat(passenger.getUniqueIdentifier()).isEqualTo(2);
    }

}
