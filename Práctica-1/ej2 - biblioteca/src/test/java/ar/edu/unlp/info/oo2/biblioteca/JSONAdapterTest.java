package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JSONAdapterTest {
    Socio juan;
    Socio pedro;
    List<Socio> listaDeSocios;
    JSONAdapter adapter;
    JSONParser parser;

    @BeforeEach
    void setUp() {
        parser = new JSONParser();
        adapter = new JSONAdapter();
        juan = new Socio("Juan","a@mail.com","1235434");
        pedro = new Socio("Pedrio","adas","2323");
        listaDeSocios = new ArrayList<>();
        listaDeSocios.add(juan);
        // listaDeSocios.add(pedro);
    }

    
    @Test
    public void testExportar() {
        
        String arr = adapter.exportar(listaDeSocios);
        JSONObject jsonSocio = new JSONObject();
        jsonSocio.put("nombre","Juan");
        jsonSocio.put("email","a@mail.com");
        jsonSocio.put("legajo","1235434");
        JSONArray jsonArr = new JSONArray();
        jsonArr.add(jsonSocio);
        assertEquals(jsonArr.toJSONString(), arr);
    }
}
