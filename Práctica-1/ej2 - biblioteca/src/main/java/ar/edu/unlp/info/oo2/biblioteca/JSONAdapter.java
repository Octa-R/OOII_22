package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONAdapter extends VoorheesExporter {

    private JSONObject exportar(Socio socio) {
        //https://stackoverflow.com/questions/35453110/json-simple-causes-compiler-warning-type-safety-the-method-putobject-object
        JSONObject json = new JSONObject();
        json.put("nombre", socio.getNombre());
        json.put("legajo", socio.getLegajo());
        json.put("email", socio.getEmail());
        
        return json;
    }

    public String exportar(List<Socio> lista) {
        // JSONArray arr = new JSONArray();
        // JSONArray arr = lista.stream()
        //     .map(item -> this.exportar(item));
        JSONArray jsonArray = new JSONArray();
        lista.forEach(item -> {
            // JSONObject obj = this.exportar(item);
            var obj = this.exportar(item);
            jsonArray.add(obj);
        });

        return jsonArray.toJSONString();
    }

    
    
}
