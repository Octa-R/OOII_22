package ar.edu.unlp.info.oo2.ej4_decodificador;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    private String nombre;
    private double puntaje;
    private List<Pelicula> similares;

    public Pelicula(String nombre, double puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.similares = new ArrayList<Pelicula>();
    }

    public void addSimilaridad(Pelicula peli) {
        this.addSimilar(peli);
        peli.addSimilar(this);
    }

    private void addSimilar(Pelicula p) {
        this.similares.add(p);
    }

    public String getNombre() {
        return this.nombre;
    }

    public List<Pelicula> getSimilares() {
        return this.similares;
    }

    public double getPuntaje() {
        return this.puntaje;
    }
    
}
