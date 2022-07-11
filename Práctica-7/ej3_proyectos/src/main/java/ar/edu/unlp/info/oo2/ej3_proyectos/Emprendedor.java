package ar.edu.unlp.info.oo2.ej3_proyectos;

import java.util.List;

public class Emprendedor {
    private String nombre;
    private List<Proyecto> proyectos;
    public Emprendedor(String nombre) {
        this.nombre = nombre;
    }

    public boolean addProyecto(Proyecto proyecto){
        return this.proyectos.add(proyecto);
    }
}
