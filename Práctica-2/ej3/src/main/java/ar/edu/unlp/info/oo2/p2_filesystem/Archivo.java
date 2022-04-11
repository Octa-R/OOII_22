package ar.edu.unlp.info.oo2.p2_filesystem;

import java.time.LocalDate;

public class Archivo extends FileSystem {

    public Archivo(String nombre, LocalDate fecha, int tamano) {
        super(nombre,fecha,tamano);
    }

    @Override
    public int tamanoTotalOcupado() {
        return this.tamano;
    }

    @Override
    public Archivo archivoMasGrande() {
        return this;
    }

    @Override
    public Archivo archivoMasNuevo() {
        return this;
    }
}
