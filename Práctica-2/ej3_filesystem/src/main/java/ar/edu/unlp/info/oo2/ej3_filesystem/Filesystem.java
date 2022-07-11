package ar.edu.unlp.info.oo2.ej3_filesystem;

import java.time.LocalDate;

public abstract class Filesystem {
    int tamano;
    String nombre;
    LocalDate fecha;

    public Filesystem(String nombre, LocalDate fecha, int tamano){
        this.nombre = nombre;
        this.fecha = fecha;
        this.tamano = tamano;
    }
    public int getTamano() {
        return this.tamano;
    }
    public LocalDate getFecha() {
        return this.fecha;
    }

    public String getNombre() {
        return nombre;
    }
}
