package basicStructure;

public class SitioTuristico extends Nodo {
    private String estadoEspecifico;

    @Override
    public String geoInformation() {
        return "Sitio turistico";
    }

    public String getEstadoEspecifico() {
        return estadoEspecifico;
    }

    public void setEstadoEspecifico(String estadoEspecifico) {
        this.estadoEspecifico = estadoEspecifico;
    }
}
