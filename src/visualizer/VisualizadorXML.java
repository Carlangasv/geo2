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
        getGrafo().getNodos().forEach(nodo -> {
            sb.append("<Nodo>").append(nodo.funcInfoGeo()).append("\n");
            nodo.getEnlaces().forEach(enlace -> {
                sb.append("<Enlace>").append(enlace.getPuntoPartida().funcInfoGeo()).append("->");
                sb.append(enlace.getPuntoLlegada().funcInfoGeo()).append("</Enlace> \n");
            });
            sb.append("</Nodo> \n");
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