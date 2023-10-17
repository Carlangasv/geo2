package basicStructure;

public class City extends Nodo {
    private String specificState;
    @Override
    public String geoInformation() {
        return "City";
    }

    public String getSpecificState() {
        return specificState;
    }

    public void setSpecificState(String specificState) {
        this.specificState = specificState;
    }
}