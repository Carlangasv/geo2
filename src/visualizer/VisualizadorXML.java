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
            sb.append("<Node>").append(e.geoInformation()).append("\n");
            e.getEnlaces().forEach( x ->{
                sb.append("<Link>").append(x.getPuntoPartida().geoInformation()).append("->");
                sb.append(x.getPuntoLlegada().geoInformation()).append("</Link> \n");
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