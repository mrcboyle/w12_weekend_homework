package plane;

public enum PlaneType {

        BOEING737("Boeing 737"),
        BOEING747("Boeing 747"),
        AIRBUSA320("AirBus A320");

        private String value;

        // Constructor
        PlaneType(String value){
                this.value = value;
        }

        // Getter
        public String getValue() {
                return this.value;
        }
}
