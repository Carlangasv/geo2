package visualizer;

import basicStructure.Grafo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class VisualizadorXML extends VisualizadorAbstracto {
    @Override
    public String visualizar(Grafo grafo) {
        StringBuilder sb = new StringBuilder();
        sb.append("<Info> \n");
        grafo.getNodos().forEach(e -> {
            sb.append("<Node>");
            sb.append(e.geoInformation());
            sb.append("\n");
            e.getEnlaces().forEach( x ->{
                sb.append("<Link>");
                sb.append(x.getPuntoPartida().geoInformation());
                sb.append("->");
                sb.append(x.getPuntoLlegada().geoInformation());
                sb.append("</Link> \n");
            });
            sb.append("</Node> \n");
        });
        sb.append("</Info>");
        return sb.toString();
    }

    @Override
    public void exportar(Grafo grafo) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("export.xml"));
        writer.write(visualizar(grafo));
        writer.close();
    }
}