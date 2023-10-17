package visualizer;

import basicStructure.Graph;

import java.io.IOException;

public abstract class AbstractVisualizer {
    public abstract String visualize(Graph graph);

    public abstract void export(Graph graph) throws IOException;
}
