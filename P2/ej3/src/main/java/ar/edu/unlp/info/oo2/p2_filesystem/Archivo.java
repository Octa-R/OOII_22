package ar.edu.unlp.info.oo2.p2_filesystem;

import java.time.LocalDate;

public class Archivo extends FileSystem {

    public Archivo(String nombre, LocalDate fecha, int tamano) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.tamano = tamano;
    }

    @Override
    public int tamanoTotalOcupado() {
        return this.tamano;
    }

    
}
