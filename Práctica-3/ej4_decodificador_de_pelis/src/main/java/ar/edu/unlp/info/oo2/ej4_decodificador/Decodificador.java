package ar.edu.unlp.info.oo2.ej4_decodificador;

import java.util.List;

public class Decodificador {

    private List<Pelicula> peliculasReproducidas;
    private Criterio criterio;

    public void setCriterio(Criterio criterio) {
        this.criterio = criterio;
    }

    public List<Pelicula> recomedarPeliculas() {
        return this.criterio.recomendar(this.peliculasReproducidas);
    }

    public void reproducirPelicula(Pelicula pelicula) {
        this.peliculasReproducidas.add(pelicula);
    }
}
