package ar.edu.unlp.info.oo2.ej4_decodificador;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecodificadorTest {

    Decodificador decodificador;
    Criterio puntaje, novedad, similaridad; 

    @BeforeEach
    void setUp() {
        
        Pelicula thor = new Pelicula("Thor", 7.9),
            capitanAmerica = new Pelicula("Capitan America", 7.8),
            ironMan = new Pelicula("Iron Man", 7.9),
            dunKirk = new Pelicula("Dunkirk", 7.9),
            rocky = new Pelicula("Rocky", 8.1),
            rambo = new Pelicula("Rambo", 7.8);

        thor.addSimilaridad(capitanAmerica);
        thor.addSimilaridad(ironMan);
        capitanAmerica.addSimilaridad(ironMan);
        rocky.addSimilaridad(rambo);

        List<Pelicula> pelis = new ArrayList<>();
        pelis.add(thor);
        pelis.add(capitanAmerica);
        pelis.add(dunKirk);
        pelis.add(ironMan);
        pelis.add(rocky);
        pelis.add(rambo);

        decodificador = new Decodificador();
        decodificador.reproducirPelicula(thor);
        decodificador.reproducirPelicula(rocky);
        
        //(i) por novedad
        novedad = new Novedad();
        decodificador.setCriterio(novedad);
        List<Pelicula> pelisNovedad = new ArrayList<>();
        pelisNovedad.add(dunKirk);
        pelisNovedad.add(capitanAmerica);
        pelisNovedad.add(ironMan);
        assertEquals(pelisNovedad, decodificador.recomedarPeliculas());
        
        //(ii) similaridad
        similaridad = new Similaridad();
        decodificador.setCriterio(similaridad);
        List<Pelicula> pelisSimilaridad = new ArrayList<>();
        pelisSimilaridad.add(capitanAmerica);
        pelisSimilaridad.add(ironMan);
        pelisSimilaridad.add(rambo);
        assertEquals(pelisSimilaridad, decodificador.recomedarPeliculas());
        
        //(iii) puntaje
        puntaje = new Puntaje();
        decodificador.setCriterio(puntaje);
        List<Pelicula> pelisPuntaje = new ArrayList<>();
        pelisPuntaje.add(dunKirk);
        pelisPuntaje.add(ironMan);
        pelisPuntaje.add(capitanAmerica);
        assertEquals(pelisPuntaje, decodificador.recomedarPeliculas());

    }

    @Test
    void testDecodificador() {

    }
    
}
