package ar.edu.unlp.info.oo2.accesobd;

import javax.xml.crypto.Data;
import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess {
    private DatabaseRealAccess db;
    private String password;
    private boolean isLogged;

    public DatabaseProxy(DatabaseRealAccess db, String password){
        this.db = db;
        this.password = password;
        this.isLogged = false;
    }
    @Override
    public Collection<String> getSearchResults(String queryString) {
        if(this.isLogged) {
            this.db.getSearchResults(queryString);
        }
        return null;
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if(isLogged) {
            int newId = this.db.insertNewRow(rowData);
            return newId;
        }
        return -1;
    }

    public void login(String password) {
        if(password.equals(this.password)) {
            this.isLogged = true;
        }
    }

    public void logout(){
        this.isLogged = false;
    }

}
