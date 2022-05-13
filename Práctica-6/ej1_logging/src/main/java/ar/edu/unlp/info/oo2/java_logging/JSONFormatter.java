package ar.edu.unlp.info.oo2.java_logging;

import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        String msj = record.getMessage();
        String lvl = record.getLevel().toString();
        JSONObject json = new JSONObject();
        json.put("level",lvl);
        json.put("message",msj);
        return json.toJSONString() + "\n";
    }
}
