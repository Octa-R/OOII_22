package ar.edu.unlp.info.oo2.p2_filesystem;

import java.time.LocalDate;

public abstract class FileSystem {
    protected String nombre;
    protected LocalDate fecha;
    protected int tamano;

    public String getNombre() {
        return this.nombre;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public int getTamano() {
        return this.tamano;
    }

    public abstract int tamanoTotalOcupado();
    
}
