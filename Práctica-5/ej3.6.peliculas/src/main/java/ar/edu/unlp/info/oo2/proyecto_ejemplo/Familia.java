package ar.edu.unlp.info.oo2.proyecto_ejemplo;

public class Familia implements Suscripcion{
    @Override
    public double calcularCosto(Pelicula pelicula) {
        return (pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno()) * 0.90;
    }
}
