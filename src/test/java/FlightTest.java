import flight.Flight;
import org.junit.Before;
import org.junit.Test;
import passengers.Passenger;
import plane.Plane;
import plane.PlaneType;
import staff.RankType;
import staff.cabincrew.CabinCrew;
import staff.pilots.Pilot;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight, flight1, flight2, flight3;
    Pilot pilot1, pilot2;
    CabinCrew crew1, crew2;
    Passenger passenger1, passenger2, passenger3;
    Plane plane1, plane2, plane3;

    @Before
    public void before(){

        flight1 = new Flight("GLA123", "Glasgow International", "London Heathrow", "08:45");
        flight2 = new Flight("PAR069", "Paris Charles De Gaul", "London Heathrow", "14:25");
        flight3 = new Flight("JFK002", "New York John F Kennedy", "London Heathrow", "20:00");
        pilot1 = new Pilot("James T Kirk", RankType.CAPTAIN, "ABC123");
        pilot2 = new Pilot("Jean-luc Picard", RankType.FIRSTOFFICER, "XYZ789");
        crew1 = new CabinCrew("John Parrot", RankType.FLIGHTATTENDANT);
        crew2 = new CabinCrew("Jimmy White", RankType.FLIGHTATTENDANT);
        passenger1 = new Passenger("Carlton Banks", 2);
        passenger2 = new Passenger("Uncle Phil", 1);
        passenger3 = new Passenger("Jazzy Jeff", 3);
        plane1 = new Plane(PlaneType.BOEING737,2,20000 );
        plane2 = new Plane(PlaneType.BOEING747,200,50000);
        plane3 = new Plane(PlaneType.AIRBUSA320,150,30000);
    }

    @Test
    public void flightHasFlightNo(){
        assertEquals("GLA123", flight1.getFlightNo());
    }

    @Test
    public void flightHasDestination(){
        assertEquals("Paris Charles De Gaul", flight2.getDestination());
    }

    @Test
    public void flightHasAirport(){
        assertEquals("London Heathrow", flight3.getDepartAirport());
    }

    @Test
    public void flightHasDepartureTime(){
        assertEquals("08:45", flight1.getDepartTime());
    }

    @Test
    public void passengerListStartsEmpty(){
        assertEquals(0, flight1.passengerListSize());
    }

    @Test
    public void canAddPassengersToFlight(){
        flight3.addPassenger(passenger1);
        flight3.addPassenger(passenger2);
        flight3.addPassenger(passenger3);
        assertEquals(3, flight3.passengerListSize());
    }

    @Test
    public void canRemovePassengersFromFlight(){
        flight3.addPassenger(passenger1);
        flight3.addPassenger(passenger2);
        flight3.addPassenger(passenger3);
        flight3.removePassenger(passenger1);
        assertEquals(2, flight3.passengerListSize());
    }

    @Test
    public void canAddPilotsToFlight(){
        flight1.addPilot(pilot1);
        flight1.addPilot(pilot2);
        assertEquals(2, flight1.pilotListSize());
    }

    @Test
    public void canAddCabinCrewToFlight(){
        flight2.addCabinCrew(crew1);
        flight2.addCabinCrew(crew2);
        assertEquals(2, flight2.cabinCrewListSize());
    }

    @Test
    public void numberOFFreeSeats(){
        flight3.addPassenger(passenger1);
        flight3.addPlane(plane1);
        assertEquals(1, flight3.freeSeats);
    }

//    @Test
//    public void canCheckInPassenger(){
//        flight.checkInPassenger(passenger1);
//        flight.checkInPassenger(passenger2);
//        flight.checkInPassenger(passenger3);
//        assertEquals(3, flight.passengerListSize());
//    }

//    @Test
//    public void canAddPassengers(){
//        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
//        ArrayList<Plane> plane = new ArrayList<Plane>();
//        passengers.add(passenger1);
//        passengers.add(passenger2);
//        passengers.add(passenger3);
//        plane.add(plane1);
//        assertEquals(3, passengers.passengerListSize);
//    }

//    @Test
//    public void flightHasPilot(){
//
//    }
//
//    @Test
//    public void flightHasCrew(){
//
//    }
//
//    @Test
//    public void flightHasPassengers(){
//
//    }
//
//    @Test
//    public void flightHasPlane(){
//
//    }

}
