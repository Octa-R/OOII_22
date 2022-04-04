package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BibliotecaTest {

    Socio juan;
    Biblioteca biblioteca;
    Exporter exporter;

    @BeforeEach
    void setUp() {
        //aca se define el tipo de adaptador
        exporter = new JacksonAdapter();
        juan = new Socio("Juan","juan@mail.com","1235434");
        biblioteca = new Biblioteca(exporter);
    }

    @Test
    public void testAgregar() {
        biblioteca.agregarSocio(juan);
        Exporter exporter = biblioteca.getExporter();
        List<Socio> listaSocios = new ArrayList<>();
        listaSocios.add(juan);

        assertEquals(biblioteca.exportarSocios(),exporter.exportar(listaSocios));
    }
}
