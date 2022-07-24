package staff.pilots;

import staff.RankType;
import staff.Staff;

public class Pilot extends Staff {

    private RankType rankType;
    private String piLicense;

    public Pilot(String name, RankType rankType, String piLicense){
        super(name);
        this.rankType = rankType;
        this.piLicense = piLicense;
    }

    public String getValueFromRankType() {
        return rankType.getValue();
    }

    public String getPilotsLicense(){
        return piLicense;
    }

    public String flyPlane(){
        // I WANT TO PUT IN AN IF STATEMENT HERE
        // IF THE TESTING PILOT HAS A PILOTS LICENSE
        // RETURN THE PILOT CAN FLY STRING
        // OTHERWISE RETURN THE PILOT CANT FLY STRING
                if (getPilotsLicense() != null){
            return "The pilot can fly the plane";
        }
        else {return "The pilot can't fly the plane";}
        }

}

