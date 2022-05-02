package ar.edu.unlp.info.oo2.carrito;

import java.util.List;

public class Carrito {
    private List<ItemCarrito> items;

    public double total() {
        return this.items.stream()
                .mapToDouble(item -> item.getMonto())
                .sum();
    }

}
