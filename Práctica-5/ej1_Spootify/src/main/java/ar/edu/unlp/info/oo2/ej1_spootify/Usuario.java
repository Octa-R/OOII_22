package ar.edu.unlp.info.oo2.ej1_spootify;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Tema> myMusic;
    public Usuario() {
        this.myMusic = new ArrayList<>();
    }
    public void agregarTema(Tema tema) {
        this.myMusic.add(tema);
    }
    public void quitarTema(Tema tema) {
        this.myMusic.remove(tema);
    }

}
