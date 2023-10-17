package basicStructure;

import java.util.List;

public class Grafo {
    private List<Enlace> enlaces;
    private List<Nodo> nodos;

    public Grafo(List<Enlace> enlaces, List<Nodo> nodos) {
        this.enlaces = enlaces;
        this.nodos = nodos;
    }

    public List<Enlace> getEnlaces() {
        return enlaces;
    }

    public void setEnlaces(List<Enlace> enlaces) {
        this.enlaces = enlaces;
    }

    public List<Nodo> getNodos() {
        return nodos;
    }

    public void setNodos(List<Nodo> nodos) {
        this.nodos = nodos;
    }
}
