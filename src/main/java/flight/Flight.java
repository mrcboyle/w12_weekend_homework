package flight;

import passengers.Passenger;
import plane.Plane;
import staff.cabincrew.CabinCrew;
import staff.pilots.Pilot;

import java.util.ArrayList;

public class Flight {

    private String flightNo;
    private String destination;
    private String departAirport;
    private String departTime;
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrew> cabinCrewList;
    private ArrayList<Passenger> passengers;
    private ArrayList<Plane> planes;


    public Flight(String flightNo, String destination, String departAirport, String departTime){
        this.flightNo = flightNo;
        this.destination = destination;
        this.departAirport = departAirport;
        this.departTime = departTime;
        this.pilots = new ArrayList<Pilot>();
        this.cabinCrewList = new ArrayList<CabinCrew>();
        this.passengers = new ArrayList<Passenger>();
        this.planes = new ArrayList<Plane>();

        // still to import plane

    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartAirport() {
        return departAirport;
    }

    public String getDepartTime() {
        return departTime;
    }

    public int passengerListSize() {
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger){
        this.passengers.remove(passenger);
    }
    public int pilotListSize() {
        return this.pilots.size();
    }
    public void addPilot(Pilot pilot){
        this.pilots.add(pilot);
    }
    public int cabinCrewListSize() {
        return this.cabinCrewList.size();
    }
    public void addCabinCrew(CabinCrew cabinCrew){
        this.cabinCrewList.add(cabinCrew);
    }
// Broken from here down
    public int planeCapacity(Plane plane) {
        return this.planes.size(plane);
    }
    public void addPlane(Plane plane){
        this.planes.add(plane);
    }

    public int freeSeats(Plane plane){
        int capacity = plane.capacity;
        int passengers = this.passengers.size();
        int freeSeats = capacity - passengers;
        return freeSeats;
    }

//    public void checkInPassenger(Passenger passenger, Plane plane){
//        if (this.passengerListSize() < this.plane.capacity){
//            this.passengers.add(passenger);
//        }
//    }

}
