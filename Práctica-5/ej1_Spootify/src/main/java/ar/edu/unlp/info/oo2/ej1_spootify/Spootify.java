package ar.edu.unlp.info.oo2.ej1_spootify;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Spootify {
    List<Usuario> usuarios;
    List<Autor> autores;

    public Spootify() {
        this.usuarios = new ArrayList<>();
        this.autores = new ArrayList<>();
    }
//    buscar por título: dado un String retorna una lista de temas cuyo título contiene o es igual al String pasado
//    como parámetro. La búsqueda es case insensitive
    public List<Tema> buscarPorTitulo(String titulo) {
        return autores.stream()
                .map(Autor::getAlbums)
                .flatMap(List::stream)
                .map(album -> album.buscarPorTitulo(titulo))
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

//    buscar por autor: dado un String retorna una lista con los temas cuyo nombre de autor contiene o es
//    igual al String recibido como parámetro. La búsqueda es case insensitive.

    public List<Tema> buscarPorAutor(String nombreAutor) {
        Pattern pattern = Pattern.compile(nombreAutor,Pattern.CASE_INSENSITIVE);

        return autores.stream()
                .filter(autor -> {
                    Matcher matcher = pattern.matcher(autor.getName());
                    return matcher.find();
                })
                .map(Autor::getAlbums)
                .flatMap(List::stream)
                .map(Album::getTemas)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
//    buscar por álbum: dado un String retorna una lista con los temas cuyo título de álbum contiene o es igual al
//    String recibido como parámetro. La búsqueda es case insensitive.

    public List<Tema> buscarPorAlbum(String nombreAlbum) {
        return autores.stream()
                .map(autor -> autor.buscarAlbumPorNombre(nombreAlbum))
                .flatMap(List::stream)
                .map(Album::getTemas)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }


    public boolean addUsuario(Usuario usr) {
        return this.usuarios.add(usr);
    }

    public boolean addAutor(Autor a) {
        return this.autores.add(a);
    }
}
