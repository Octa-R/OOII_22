package ar.edu.unlp.info.oo2.p2_filesystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Directorio extends FileSystem {
    
    private List<FileSystem> data;

    public Directorio(String nombre, LocalDate fecha) {
        super(nombre,fecha,32);
        this.data = new ArrayList<FileSystem>();
    }

    @Override
    public int tamanoTotalOcupado() {
        return this.data.stream()
            .mapToInt(item -> item.tamanoTotalOcupado())
            .sum() + this.tamano;
    }

    public Archivo archivoMasGrande() {
        return this.data.stream()
            .map(c -> c.archivoMasGrande())
            .max(Comparator.comparingInt(c -> c.tamanoTotalOcupado()))
            .orElse(null);
    }

    public Archivo archivoMasNuevo() {
        return this.data.stream()
            .map(c -> c.archivoMasNuevo())
            .max(Comparator.comparing(c -> c.getFecha()))
            .orElse(null);
    }

    public boolean agregar(FileSystem fs) {
        return this.data.add(fs);
    }
}
