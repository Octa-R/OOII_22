package ar.edu.unlp.info.oo2.java_logging;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DatabaseRealAccessTest {
    private DatabaseProxy database;

    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseProxy(new DatabaseRealAccess(),"password123");
        this.database.login("password123");
    }

    @Test
    void testGetSearchResults() {
        //aca haceun info por el search válido
        // y un warning por el inválido
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.database.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRow() {
        //aca hace un warn por el insert
        // y un info por el search
        assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database.getSearchResults("select * from comics where id=3"));
    }

    @Test
    void testInvalidInsert() {
        //hace un severe
        this.database.logout();
        assertEquals(-1,this.database.insertNewRow(Arrays.asList("asd","asd")));
    }

    @Test
    void testInvalidSearch() {
        //hace un severe
        this.database.logout();
        assertEquals(null,this.database.getSearchResults("select * from comics where id=3"));
    }

    @Test
    void testInvalidLogin() {
        //aca hace un severe
        this.database.logout();
        this.database.login("una pass inválida");
        assertFalse(this.database.isLogged());
    }
}