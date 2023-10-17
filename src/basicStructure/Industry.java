package basicStructure;

public class Industry extends Nodo {

    private String specificState;
    @Override
    public String geoInformation() {
        return "Industry";
    }

    public String getSpecificState() {
        return specificState;
    }

    public void setSpecificState(String specificState) {
        this.specificState = specificState;
    }
}