package visualizer;

import basicStructure.Graph;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class XMLVisualizer extends AbstractVisualizer{
    @Override
    public String visualize(Graph graph) {
        StringBuilder sb = new StringBuilder();
        sb.append("<Info> \n");
        graph.getNodes().forEach(e -> {
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
    public void export(Graph graph) throws IOException {
        AbstractVisualizer visualizer = new XMLVisualizer();
        BufferedWriter writer = new BufferedWriter(new FileWriter("export.xml"));
        writer.write(visualizer.visualize(graph));
        writer.close();
    }
}