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
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("\"info\": {\n");

        AtomicInteger index = new AtomicInteger();
        getGrafo().getNodos().forEach(node -> {
            sb.append('\"').append(node.geoInformation()).append("\": {\n");
            node.getEnlaces().forEach(link -> {
                sb.append("\"Link")
                        .append(index.getAndIncrement()).append("\": {\n");
                sb.append("\"source\": \"").append(link.getPuntoPartida().geoInformation()).append("\",\n");
                sb.append("\"destiny\": \"").append(link.getPuntoLlegada().geoInformation()).append("\"\n");
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