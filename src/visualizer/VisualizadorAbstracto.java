package visualizer;

import basicStructure.Grafo;

import java.io.IOException;

public abstract class VisualizadorAbstracto {
    public abstract String visualizar(Grafo grafo);

    public abstract void exportar(Grafo grafo) throws IOException;
}
