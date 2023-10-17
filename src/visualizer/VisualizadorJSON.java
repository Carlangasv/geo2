package visualizer;

import basicStructure.Grafo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class VisualizadorJSON extends VisualizadorAbstracto {

    @Override
    public String visualizar(Grafo grafo) {
        StringBuilder sb = new StringBuilder();
        AtomicInteger index = new AtomicInteger();
        sb.append("{ \n");
        sb.append("\"info\":{\n");
        grafo.getNodos().forEach(e -> {
            sb.append("\"");
            sb.append(e.geoInformation());
            sb.append("\"");
            sb.append(":{ \n");
            e.getEnlaces().forEach(x -> {
                sb.append("\"Link");
                sb.append(index.get());
                sb.append("\"");
                sb.append(":{ \n");
                sb.append("\"source\":");
                sb.append("\"");
                sb.append(x.getPuntoPartida().geoInformation());
                sb.append("\"");
                sb.append(", \n");
                sb.append("\"destiny\":");
                sb.append("\"");
                sb.append(x.getPuntoLlegada().geoInformation());
                sb.append("\"");
                sb.append("\n");
                sb.append("}, \n");
                index.getAndIncrement();
            });
            sb.append("}, \n");
        });
        sb.append("} \n");
        sb.append("} \n");
        return sb.toString();
    }

    @Override
    public void exportar(Grafo grafo) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("export.json"));
        writer.write(visualizar(grafo));
        writer.close();
    }
}