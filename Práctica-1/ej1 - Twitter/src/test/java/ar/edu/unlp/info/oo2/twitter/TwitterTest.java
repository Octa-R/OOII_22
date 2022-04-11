package ar.edu.unlp.info.oo2.twitter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
    Twitter twitter;
    Usuario juan;
    Usuario pedro;
    @BeforeEach
    void setUp() {
        twitter = new Twitter();
        juan = new Usuario("juancito44");
        pedro = new Usuario("username");
    }

    @Test
    public void testCrearUsuario() {
        Usuario pedroRepetido = new Usuario("username");
        twitter.addUsuario(pedro);
        twitter.addUsuario(juan);
        twitter.addUsuario(pedroRepetido);
        
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        listaUsuarios.add(juan);
        listaUsuarios.add(pedro);
        
        assertEquals(listaUsuarios.size(), twitter.getUsuarios().size());
        assertTrue(twitter.getUsuarios().contains(pedro));
        assertTrue(twitter.getUsuarios().contains(juan));
        assertFalse(twitter.getUsuarios().contains(pedroRepetido));
    }
    
}
