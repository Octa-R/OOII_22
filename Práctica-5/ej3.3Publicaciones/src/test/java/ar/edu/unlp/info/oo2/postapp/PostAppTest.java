package ar.edu.unlp.info.oo2.postapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class PostAppTest {

    PostApp app;
    Usuario user1,user2;

    @BeforeEach
    void setUp() throws Exception {

        app = new PostApp();
        user1 = new Usuario("duzeto");
        user2 = new Usuario("ElGordoUwu");

        app.crearPost(user1,"jijoooooo");
        TimeUnit.SECONDS.sleep(5);
        app.crearPost(user1,"ndeaaah1");

        TimeUnit.SECONDS.sleep(1);
        app.crearPost(user1,"ndeaaah2");

        TimeUnit.SECONDS.sleep(1);
        app.crearPost(user2,"ndeaaah3");

        TimeUnit.SECONDS.sleep(1);
        app.crearPost(user2,"ndeaaah4");

        TimeUnit.SECONDS.sleep(1);
        app.crearPost(user1,"ultimo");
    }

    @Test
    public void ultimosPostTest() {
//        app.ultimosPosts(user1,2);
        assertEquals(app.ultimosPosts(user1,2),app.ultimosPost2(user1,2));
    }


}