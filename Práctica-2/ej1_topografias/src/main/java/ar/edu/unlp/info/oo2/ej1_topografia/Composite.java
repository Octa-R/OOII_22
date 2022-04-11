package ar.edu.unlp.info.oo2.ej1_topografia;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Topografia {

    private List<Topografia> topografias;

    public Composite(List<Topografia> topografias) {
        this.topografias = new ArrayList<>();
        this.topografias.addAll(topografias);
    }

    public void add(Topografia t, int pos) {
        this.topografias.add(pos, t);
    }

    @Override
    public double calcularProporcionDeAgua() {
        return this.topografias.stream()
            .mapToDouble(item -> item.calcularProporcionDeAgua())
            .sum() / 4;
        // return (topografias.get(0).calcularProporcionDeAgua()
        //     + topografias.get(1).calcularProporcionDeAgua()
        //     + topografias.get(2).calcularProporcionDeAgua()
        //     + topografias.get(3).calcularProporcionDeAgua())
        //     / 4;
    }
    
}
