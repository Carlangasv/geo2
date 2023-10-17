package basicStructure;

import java.util.List;

public class Graph {
    private List<Enlace> enlaces;
    private List<Nodo> nodos;

    public Graph(List<Enlace> enlaces, List<Nodo> nodos) {
        this.enlaces = enlaces;
        this.nodos = nodos;
    }

    public List<Enlace> getLinks() {
        return enlaces;
    }

    public void setLinks(List<Enlace> enlaces) {
        this.enlaces = enlaces;
    }

    public List<Nodo> getNodes() {
        return nodos;
    }

    public void setNodes(List<Nodo> nodos) {
        this.nodos = nodos;
    }
}
