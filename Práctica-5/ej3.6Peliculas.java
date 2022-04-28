public class Usuario {
    String tipoSubscripcion;
    public void setTipoSubscripcion(String unTipo) {
   	    this.tipoSubscripcion = unTipo;
    }
    public double calcularCostoPelicula(Pelicula pelicula) {
        // bad smell variable auxiliar
   	    double costo = 0;
        // bad smell condicionales por tipo
   	    if (tipoSubscripcion == "Basico") {
   		    costo = pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno();
   	    } else if (tipoSubscripcion == "Familia") {
   		    costo = (pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno()) * 0.90;
   	    } else if (tipoSubscripcion == "Plus") {
   		     costo = pelicula.getCosto();
   	    } else if (tipoSubscripcion == "Premium") {
   		    costo = pelicula.getCosto() * 0.75;
   	    }
   	    return costo;
    }
}

public class Pelicula {
    LocalDate fechaEstreno;
    public double getCosto() {
   	    return this.costo;
    }
    public double calcularCargoExtraPorEstreno() {
	    // Si la Película se estrenó 30 días antes de la fecha actual, retorna un cargo de 0$,
        // caso contrario, retorna un cargo extra de 300$
   	    return (ChronoUnit.DAYS.between(this.fechaEstreno, LocalDate.now()) ) > 30 ? 0 : 300;
    }
}
// REFACTORING
//Replace Conditional with Polymorphism
public interface Subscripcion {
    public double getCosto(Pelicula pelicula);
}

public class Basico implements Subscripcion {
    public double getCosto(Pelicula pelicula) {
    return pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno();
        
    }
}
public class Familia implements Subscripcion {
    public double getCosto(Pelicula pelicula) {
        return (pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno()) * 0.90;
    }
}
public class Plus implements Subscripcion {
    public double getCosto(Pelicula pelicula) {
        return pelicula.getCosto();
    }
}
public class Premium implements Subscripcion {
    public double getCosto(Pelicula pelicula) {
        return pelicula.getCosto() * 0.75;
    }
}
