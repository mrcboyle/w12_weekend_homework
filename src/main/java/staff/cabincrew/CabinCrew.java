package staff.cabincrew;

import staff.RankType;
import staff.Staff;

public class CabinCrew extends Staff {

    private RankType rankType;

    public CabinCrew(String name, RankType rankType){
        super(name);
        this.rankType = rankType;
    }

    public RankType getRankType() {
        return rankType;
    }

    public String getValueFromRankType() {
        return rankType.getValue();
    }

    public String passengerAnnouncement(){
        return "Fasten Seatbelts";
    }

}
