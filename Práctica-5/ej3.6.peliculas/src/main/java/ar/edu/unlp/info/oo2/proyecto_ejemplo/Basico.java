package ar.edu.unlp.info.oo2.proyecto_ejemplo;

public class Basico implements Suscripcion{
    @Override
    public double calcularCosto(Pelicula pelicula) {
        return pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno();
    }
}
