package ar.edu.unlp.info.oo2.ej1_topografia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
1 === agua
0 === tierra
*/
public class TopografiaTest {

    Atomic t_agua,t_tierra;
    List<Topografia> lista1,lista2;
    Topografia t1, t2;

	@BeforeEach
	void setUp() {
        t_agua = new Atomic(1);
        t_tierra = new Atomic(0);
        
        // topografia
        //  1.AGUA    |   2.TIERRA
        //  3.TIERRA  |   4.AGUA
        lista1 = new ArrayList<Topografia>();
        lista1.add(0,t_agua);
        lista1.add(1,t_tierra);
        lista1.add(2,t_tierra);
        lista1.add(3,t_agua);
        
        t1 = new Composite(lista1);

        //topografia 2
        //1Agua     | 2 Tierra
        // 3 Tierra | agua | tierra
        //            tierra | agua

        lista2 = new ArrayList<Topografia>();
        lista2.add(0,t_agua);
        lista2.add(1,t_tierra);
        lista2.add(2,t_tierra);
        lista2.add(3,t1);

        t2 = new Composite(lista2);

	}

	@Test
	public void testCalcularProporcion() {
        assertEquals(1, t_agua.calcularProporcionDeAgua());
        assertEquals(0,t_tierra.calcularProporcionDeAgua());
        assertEquals(0.5,t1.calcularProporcionDeAgua());

	}


    // @Test
    // public void testequals() {

    // }
}
