package staff;

public enum RankType {

    CAPTAIN("Captain"),
    FIRSTOFFICER("First Officer"),
    PURSER("Purser"),
    FLIGHTATTENDANT("Flight Attendant");

    private String value;

    // Constructor
    RankType(String value){
        this.value = value;
    }

    // Getter
    public String getValue() {
        return this.value;
    }
}
