package visualizer;

import basicStructure.Grafo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class VisualizadorJSON extends VisualizadorAbstracto {

    public VisualizadorJSON(Grafo grafo) {
        super(grafo);
    }


    @Override
    public String visualizar() {
        AtomicInteger index = new AtomicInteger();
        StringBuilder sb = new StringBuilder();
        sb.append("{\n").append("\"información\": {\n");
        getGrafo().getNodos().forEach(nodo -> {
            sb.append('\"').append(nodo.funcInfoGeo()).append("\": {\n");
            nodo.getEnlaces().forEach(enlace -> {
                sb.append("\"Enlace").append(index.getAndIncrement()).append("\": {\n");
                sb.append("\"puntoPartida\": \"").append(enlace.getPuntoPartida().funcInfoGeo()).append("\",\n");
                sb.append("\"puntoLlegada\": \"").append(enlace.getPuntoLlegada().funcInfoGeo()).append("\"\n");
                sb.append("},\n");
            });
            sb.deleteCharAt(sb.length() - 2);
            sb.append("},\n");
        });
        sb.deleteCharAt(sb.length() - 2);
        sb.append("}\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public void exportar() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("export.json"));
        writer.write(visualizar());
        writer.close();
    }
}