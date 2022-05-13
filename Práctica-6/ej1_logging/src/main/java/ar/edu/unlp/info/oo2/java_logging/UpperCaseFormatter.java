package ar.edu.unlp.info.oo2.java_logging;

import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class UpperCaseFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        String msj = record.getMessage();
        Level lvl = record.getLevel();
        return lvl.toString().toUpperCase() + ": " + msj.toUpperCase() + "\n";
    }
}
