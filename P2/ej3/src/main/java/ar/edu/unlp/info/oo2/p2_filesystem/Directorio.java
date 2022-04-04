package ar.edu.unlp.info.oo2.p2_filesystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio extends FileSystem {
    
    private List<FileSystem> data;

    public Directorio(String nombre, LocalDate fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.tamano = 32;
        this.data = new ArrayList<>();
    }

    @Override
    public int tamanoTotalOcupado() {
        return this.data.stream()
            .mapToInt(item -> item.tamanoTotalOcupado())
            .sum() + this.tamano;
    }

    public Archivo archivoMasGrande() {
        return null;
    }

    public Archivo archivoMasNuevo() {
        return null;
    }

    public boolean agregar(FileSystem fs) {
        return this.data.add(fs);
    }
    
}
