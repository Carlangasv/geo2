package basicStructure;

public class Industria extends Nodo {

    private String estadoEspecifico;
    @Override
    public String geoInformation() {
        return "Industria";
    }

    public String getEstadoEspecifico() {
        return estadoEspecifico;
    }

    public void setEstadoEspecifico(String estadoEspecifico) {
        this.estadoEspecifico = estadoEspecifico;
    }
}