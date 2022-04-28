package ar.edu.unlp.info.oo2.ej1_spootify;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Album {
    private String nombre;
    private List<Tema> temas;

    public Album(String nombre,List<Tema> listaDeTemas) {
        this.nombre = nombre;
        this.temas = listaDeTemas;
    }
    public List<Tema> getTemas() {
        return this.temas;
    }
    public List<Tema> buscarPorTitulo(String titulo) {

        Pattern pattern = Pattern.compile(titulo,Pattern.CASE_INSENSITIVE);

        return temas.stream()
                .filter(tema -> {
                    Matcher matcher = pattern.matcher(tema.getNombre());
                    return matcher.find();
                })
                .collect(Collectors.toList());
    }
    public String getNombre() {
        return this.nombre;
    }
}
