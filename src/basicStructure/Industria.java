package basicStructure;

public class Industria extends Nodo {

    private String estadoEspecifico;
    @Override
    public String funcInfoGeo() {
        return "Industria";
    }

    public String getEstadoEspecifico() {
        return estadoEspecifico;
    }

    public void setEstadoEspecifico(String estadoEspecifico) {
        this.estadoEspecifico = estadoEspecifico;
    }
}