package ar.edu.unlp.info.oo2.biblioteca;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonAdapter implements Exporter {

    private ObjectMapper mapper;

    public JacksonAdapter() {
        mapper = new ObjectMapper();
    }

    public String exportar(List<Socio> socios) {
        try {
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(socios);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }

    }
}
