package basicStructure;

public class TourismPlace extends Nodo {

    private String specificState;

    @Override
    public String geoInformation() {
        return "Tourism place";
    }

    public String getSpecificState() {
        return specificState;
    }

    public void setSpecificState(String specificState) {
        this.specificState = specificState;
    }
}
