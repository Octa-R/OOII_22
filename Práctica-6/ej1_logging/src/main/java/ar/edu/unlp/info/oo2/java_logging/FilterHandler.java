package ar.edu.unlp.info.oo2.java_logging;

import java.util.Formatter;
import java.util.List;
import java.util.Vector;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class FilterHandler extends Handler {
    private String[] words;
    public FilterHandler(String[] words){
        super();
        this.words = words;
    }

    @Override
    public void publish(LogRecord record) {
        String message = record.getMessage();
        for(int i = 0; i < words.length; i++ ) {
            message.replace(words[i],"***");
        }
    }

    @Override
    public void flush() {

    }

    @Override
    public void close() throws SecurityException {

    }
}
