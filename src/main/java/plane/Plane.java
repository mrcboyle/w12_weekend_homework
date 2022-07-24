package plane;

public class Plane {

    private PlaneType planeType;
    private int capacity;
    private int totalWeight;

    public Plane(PlaneType planeType, int capacity, int totalWeight){
        this.planeType = planeType;
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public String getValueFromPlaneType() {
        return planeType.getValue();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

}
