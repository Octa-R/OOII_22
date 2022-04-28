package ar.edu.unlp.info.oo2.ej1_spootify;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Autor {
    private String nombre;
    private List<Album> albums;

    public Autor(List<Album> discografia) {
        this.albums = discografia;
    }

    public List<Album> getAlbums() {
        return this.albums;
    }

    public List<Album> buscarAlbumPorNombre(String nombreAlbum) {
        Pattern pattern = Pattern.compile(nombreAlbum,Pattern.CASE_INSENSITIVE);

        return this.albums.stream()
                .filter(album -> {
                    Matcher matcher = pattern.matcher(album.getNombre());
                    return matcher.find();
                })
                .collect(Collectors.toList());
    }

    public String getName() {
        return this.nombre;
    }
}
