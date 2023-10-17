import basicStructure.*;
import visualizer.AbstractVisualizer;
import visualizer.JSONVisualizer;
import visualizer.XMLVisualizer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Graph mainGraph = initialize();
        export(mainGraph);
    }
    private static Graph initialize() {
        Nodo nodo1 = new Industry();
        Nodo nodo2 = new City();
        Nodo nodo3 = new TourismPlace();
        Enlace enlaceCityIndustry = new Enlace(nodo2, nodo1);
        Enlace enlaceCityPlace = new Enlace(nodo2, nodo3);
        Enlace enlaceIndustryPlace = new Enlace(nodo1, nodo3);
        List<Enlace> enlaces = new ArrayList<>(Arrays.asList(enlaceCityPlace, enlaceCityIndustry, enlaceIndustryPlace));
        List<Nodo> nodos = new ArrayList<>(Arrays.asList(nodo1, nodo2, nodo3));
        return new Graph(enlaces, nodos);
    }

    private static void export(Graph graph) throws IOException {
        AbstractVisualizer jsonVisualizer = new JSONVisualizer();
        AbstractVisualizer xmlVisualizer = new XMLVisualizer();
        jsonVisualizer.export(graph);
        xmlVisualizer.export(graph);
    }
}
