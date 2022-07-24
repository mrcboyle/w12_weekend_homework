import org.junit.Before;
import org.junit.Test;
import plane.Plane;
import plane.PlaneType;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1, plane2, plane3;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.BOEING737,100,20000 );
        plane2 = new Plane(PlaneType.BOEING747,200,50000);
        plane3 = new Plane(PlaneType.AIRBUSA320,150,30000);
    }

    @Test
    public void hasCapacity(){
        assertEquals(100, plane1.getCapacity());
    }

    @Test
    public void hasTotalWeight(){
        assertEquals(50000, plane2.getTotalWeight());
    }

    @Test
    public void hasPlaneType(){
        assertEquals("AirBus A320", plane3.getValueFromPlaneType());
    }

}

