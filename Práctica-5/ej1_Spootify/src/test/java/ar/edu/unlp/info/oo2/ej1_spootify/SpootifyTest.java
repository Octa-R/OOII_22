package ar.edu.unlp.info.oo2.ej1_spootify;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SpootifyTest {
    Spootify app;
    List<Tema> listaDeTemas;
    Tema soyUnCreep = new Tema("Creep");

    @BeforeEach
    void setup() {
        app = new Spootify();

        listaDeTemas = new ArrayList<>();
        listaDeTemas.add(soyUnCreep);

        Album albumDeRadiohead = new Album("un album de radiohead",listaDeTemas);
        List<Album> discografiaRadiohead = new ArrayList<>();
        discografiaRadiohead.add(albumDeRadiohead);
        Autor radiocabeza = new Autor(discografiaRadiohead);

        app.addAutor(radiocabeza);

    }

    @Test
    void buscarPorTituloTest() {

        //busca si el string estan contenido en el titulo no si es un match exacto
        assertTrue(app.buscarPorTitulo("creep").contains(soyUnCreep));
        assertTrue(app.buscarPorTitulo("cre").contains(soyUnCreep));
        assertTrue(app.buscarPorTitulo("e").contains(soyUnCreep));
        assertTrue(app.buscarPorTitulo("Creep").contains(soyUnCreep));

    }

    @Test
    void buscarPorAlbumTest() {

    }

    @Test
    void buscarPorAutorTest() {}
}
