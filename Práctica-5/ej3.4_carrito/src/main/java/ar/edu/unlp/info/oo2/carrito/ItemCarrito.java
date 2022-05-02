package ar.edu.unlp.info.oo2.carrito;

public class ItemCarrito {
    private Producto producto;
    private int cantidad;



    public Producto getProducto() {
        return this.producto;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public double getMonto() {
        return this.cantidad * this.producto.getPrecio();
    }

}
