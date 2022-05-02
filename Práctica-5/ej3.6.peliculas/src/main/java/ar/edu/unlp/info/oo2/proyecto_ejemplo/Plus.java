package ar.edu.unlp.info.oo2.proyecto_ejemplo;

public class Plus implements Suscripcion {
    @Override
    public double calcularCosto(Pelicula pelicula) {
        return pelicula.getCosto();
    }
}
