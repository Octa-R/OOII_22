package ar.edu.unlp.info.oo2.java_logging;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.logging.*;

public class DatabaseProxy implements DatabaseAccess {
    private DatabaseAccess db;
    private String password;
    private boolean isLogged;
    private Logger logger;

    public DatabaseProxy(DatabaseAccess db, String password) throws IOException {
        this.db = db;
        this.password = password;
        this.isLogged = false;
        //nombre del logeer es "db"
        logger = Logger.getLogger("dblogger");

        //level warning
        logger.setLevel(Level.ALL);

        //HANDLER
        /* se agrega console handler con simple formatter */
        FileHandler consoleHandler = new FileHandler(".\\log.txt");
        Handler handler = new FilterHandler(new String[]{"xd"});

        //FORMATTER
//        Formatter formatter = new SimpleFormatter();
        Formatter formatter = new JSONFormatter();
//        Formatter formatter = new UpperCaseFormatter();

        consoleHandler.setFormatter(formatter);
        logger.addHandler(consoleHandler);
    }
    @Override
    public Collection<String> getSearchResults(String queryString) {
        if (isLogged) {
            Logger.getLogger("dblogger").log(Level.INFO,"valid search access");
            return this.db.getSearchResults(queryString);
        }
        Logger.getLogger("dblogger").log(Level.SEVERE,"invalid search access");
        return null;
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if  (isLogged) {
            Logger.getLogger("dblogger").log(Level.WARNING,"valid insertion acces");
            int newId = this.db.insertNewRow(rowData);
            return newId;
        }
        Logger.getLogger("dblogger").log(Level.SEVERE,"invalid insertion acces");
        return -1;
    }

    public void login(String password) {
        if(password.equals(this.password)) {
            this.isLogged = true;
        } else {
            Logger.getLogger("dblogger").log(Level.SEVERE,"invalid access, wrong password");
        }
    }

    public void logout() {
        this.isLogged = false;
    }

    public boolean isLogged() {
        return isLogged;
    }
}
