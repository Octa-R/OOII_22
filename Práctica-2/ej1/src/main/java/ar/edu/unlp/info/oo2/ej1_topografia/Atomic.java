package ar.edu.unlp.info.oo2.ej1_topografia;

public class Atomic extends Topografia {
    private int topografia;
    
    public Atomic(int t) {
        this.topografia = t;
    }

    @Override
    public double calcularProporcionDeAgua() {
        return this.topografia;
    }

}
