package visualizer;

import basicStructure.Grafo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class VisualizadorXML extends VisualizadorAbstracto {

    public VisualizadorXML(Grafo grafo) {
        super(grafo);
    }

    @Override
    public String visualizar() {
        StringBuilder sb = new StringBuilder();
        sb.append("<Info> \n");
        getGrafo().getNodos().forEach(e -> {
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
    public void exportar() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("export.xml"));
        writer.write(visualizar());
        writer.close();
    }
}