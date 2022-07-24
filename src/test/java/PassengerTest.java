import org.junit.Before;
import org.junit.Test;
import passengers.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1, passenger2, passenger3;

    @Before
    public void before() {
        passenger1 = new Passenger("Carlton Banks", 2);
        passenger2 = new Passenger("Uncle Phil", 1);
        passenger3 = new Passenger("Jazzy Jeff", 3);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Uncle Phil", passenger2.getName());
    }

    @Test
    public void passengerHasBag(){
        assertEquals(2, passenger1.getNoOfBags());
    }

}
