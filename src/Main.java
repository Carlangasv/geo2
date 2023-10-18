import basicStructure.*;
import visualizer.VisualizadorAbstracto;
import visualizer.VisualizadorJSON;
import visualizer.VisualizadorXML;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Grafo mainGrafo = inicializar();
        exportar(mainGrafo);
    }
    private static Grafo inicializar() {
        Nodo nodo1 = new Industria();
        Nodo nodo2 = new Ciudad();
        Nodo nodo3 = new SitioTuristico();
        Enlace enlaceCityIndustry = new Enlace(nodo2, nodo1);
        Enlace enlaceCityPlace = new Enlace(nodo2, nodo3);
        Enlace enlaceIndustryPlace = new Enlace(nodo1, nodo3);
        List<Enlace> enlaces = new ArrayList<>(Arrays.asList(enlaceCityPlace, enlaceCityIndustry, enlaceIndustryPlace));
        List<Nodo> nodos = new ArrayList<>(Arrays.asList(nodo1, nodo2, nodo3));
        return new Grafo(enlaces, nodos);
    }

    private static void exportar(Grafo grafo) throws IOException {
        VisualizadorAbstracto jsonVisualizer = new VisualizadorJSON(grafo);
        VisualizadorAbstracto xmlVisualizer = new VisualizadorXML(grafo);
        jsonVisualizer.exportar();
        xmlVisualizer.exportar();
    }
}
