import org.junit.Before;
import org.junit.Test;
import staff.RankType;
import staff.cabincrew.CabinCrew;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew crew1, crew2;

    @Before
    public void before() {
        crew1 = new CabinCrew("John Parrot", RankType.FLIGHTATTENDANT);
        crew2 = new CabinCrew("Jimmy White", RankType.FLIGHTATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("John Parrot", crew1.getName());
    }

    @Test
    public void hasRank(){
        assertEquals("Flight Attendant", crew2.getValueFromRankType());
    }

    @Test
    public void canSpeakToPassengers() {
        assertEquals("Fasten Seatbelts", crew1.passengerAnnouncement());
    }

}
