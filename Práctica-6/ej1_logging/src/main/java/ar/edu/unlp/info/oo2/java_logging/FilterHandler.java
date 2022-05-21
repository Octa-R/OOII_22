package ar.edu.unlp.info.oo2.java_logging;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class FilterHandler extends Handler {
    private String[] words;
    private Handler handler;
    public FilterHandler(String[] words,Handler handler){
        super();
        this.handler = handler;
        this.words = words;
    }

    @Override
    public void publish(LogRecord record) {
        String message = record.getMessage();
        for (String word : words) {
            message = message.replace(word, "***");
        }
        record.setMessage(message);
        this.handler.publish(record);
    }

    @Override
    public void flush() {
        this.handler.flush();
    }

    @Override
    public void close() throws SecurityException {
        this.handler.close();
    }
}
