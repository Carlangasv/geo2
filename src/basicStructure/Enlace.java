package basicStructure;

public class Enlace {
    private Nodo puntoPartida;
    private Nodo puntoLlegada;

    public Enlace(Nodo puntoPartida, Nodo puntoLlegada) {
        this.puntoPartida = puntoPartida;
        this.puntoLlegada = puntoLlegada;
        this.puntoPartida.getEnlaces().add(this);
        this.puntoLlegada.getEnlaces().add(this);
    }

    public Nodo getPuntoPartida() {
        return puntoPartida;
    }

    public void setPuntoPartida(Nodo puntoPartida) {
        this.puntoPartida = puntoPartida;
    }

    public Nodo getPuntoLlegada() {
        return puntoLlegada;
    }

    public void setPuntoLlegada(Nodo puntoLlegada) {
        this.puntoLlegada = puntoLlegada;
    }
}
