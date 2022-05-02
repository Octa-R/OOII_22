package ar.edu.unlp.info.oo2.proyecto_ejemplo;

public class Usuario {
//    String tipoSubscripcion;
    Suscripcion suscripcion;


//    public void setTipoSubscripcion(String unTipo) {
//        this.tipoSubscripcion = unTipo;
//    }

    public Usuario(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
    }

    public void setSuscripcion(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
    }

//    public double calcularCostoPelicula(Pelicula pelicula) {
//        double costo = 0;
//        if (tipoSubscripcion=="Basico") {
//            costo = pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno();
//        }
//        else if (tipoSubscripcion== "Familia") {
//            costo = (pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno()) * 0.90;
//        }
//        else if (tipoSubscripcion=="Plus") {
//            costo = pelicula.getCosto();
//        }
//        else if (tipoSubscripcion=="Premium") {
//            costo = pelicula.getCosto() * 0.75;
//        }
//        return costo;
//    }

    //refactoring replace conditional with polymorfism
    public double calcularCostoPelicula(Pelicula pelicula) {
        return this.suscripcion.calcularCosto(pelicula);
    }
}
