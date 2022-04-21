package ar.edu.unlp.info.oo2.ej1_spootify;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<String> myMusic;
    public Usuario() {
        this.myMusic = new ArrayList<>();
    }
    public void agregarTema(String tema) {
        this.myMusic.add(tema);
    }
    public void quitarTema(String tema) {
        this.myMusic.remove(tema);
    }

}
