package basicStructure;

import java.util.ArrayList;
import java.util.List;

public abstract class Nodo {
    private List<Enlace> enlaces;

    public Nodo() {
        this.enlaces = new ArrayList<>();
    }

    public abstract String geoInformation();

    public List<Enlace> getEnlaces() {
        return enlaces;
    }

    public void setEnlaces(List<Enlace> enlaces) {
        this.enlaces = enlaces;
    }
}