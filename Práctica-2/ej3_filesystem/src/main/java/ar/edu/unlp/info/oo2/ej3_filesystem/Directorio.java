package ar.edu.unlp.info.oo2.ej3_filesystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

public class Directorio extends Filesystem{
    List<Filesystem> children;

    public Directorio(String nombre, LocalDate fecha) {
        super(nombre,fecha,32);
        this.children = new ArrayList<Filesystem>();
    }

    public int tamanoTotalOcupado(){
        return this.children.stream()
                .mapToInt(c -> c.getTamano())
                .sum() + this.tamano;
    }

    public Archivo archivoMasGrande() {
        return (Archivo) this.children.stream()
                .filter(e -> e instanceof Archivo)
                .max(Comparator.comparingInt(e -> e.getTamano()))
                .orElse(null);
    }

    public Archivo archivoMasNuevo(){
        return (Archivo) this.children.stream()
                .filter(e -> e instanceof Archivo)
                .max(Comparator.comparing(e -> e.getFecha()))
                .orElse(null);
    }
    @Override
    public int getTamano() {
        return this.tamano;
    }
    public void agregar(Filesystem children) {
        this.children.add(children);
    }
}
