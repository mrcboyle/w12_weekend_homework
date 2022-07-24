import org.junit.Before;
import org.junit.Test;
import staff.RankType;
import staff.pilots.Pilot;
import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot1, pilot2;

    @Before
    public void before(){
        pilot1 = new Pilot("James T Kirk", RankType.CAPTAIN, "ABC123");
        pilot2 = new Pilot("Jean-luc Picard", RankType.FIRSTOFFICER, "XYZ789");
    }

    @Test
    public void hasName() {
        assertEquals("James T Kirk", pilot1.getName());
    }

    @Test
    public void hasRank(){
        assertEquals("First Officer", pilot2.getValueFromRankType());
    }

    @Test
    public void hasPilotsLicense() {
        assertEquals("ABC123", pilot1.getPilotsLicense());
    }

    @Test
    public void canFlyPlane() {
        pilot2.getPilotsLicense();
        assertEquals("The pilot can fly the plane", pilot2.flyPlane());
    }

}
