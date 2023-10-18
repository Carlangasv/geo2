package visualizer;

import basicStructure.Grafo;

import java.io.IOException;

public abstract class VisualizadorAbstracto {

    private Grafo grafo;

    public VisualizadorAbstracto(Grafo grafo) {
        this.grafo = grafo;
    }

    public abstract String visualizar();

    public abstract void exportar() throws IOException;

    public Grafo getGrafo() {
        return grafo;
    }

}
