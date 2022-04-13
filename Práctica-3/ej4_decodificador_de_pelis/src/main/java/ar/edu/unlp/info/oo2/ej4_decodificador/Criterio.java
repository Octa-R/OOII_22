package ar.edu.unlp.info.oo2.ej4_decodificador;

import java.util.List;

public interface Criterio {

    public List<Pelicula> recomendar(List<Pelicula> peliculasReproducidas);
    
    
}
