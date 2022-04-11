package ar.edu.unlp.info.oo2.twitter;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
    private List<Usuario> usuarios;

    public Twitter() {
        this.usuarios = new ArrayList<>();
    }
    
    public List<Usuario> getUsuarios() {
        return this.usuarios;
    }

    //creo el usuario acá
    public boolean addUsuario(Usuario usuario) {
        if(this.screenNameDisponible(usuario.getScreenName())) {
            this.usuarios.add(usuario);
            return true;
        }
        return false;
    }

    private boolean screenNameDisponible(String screenName) {
        return !this.usuarios.stream()
            .map(u -> u.getScreenName())
            .anyMatch(name -> name.equals(screenName));
    }

    public boolean delete(String screenName) {
        Usuario usr = this.usuarios.stream()
            .filter(u -> u.getScreenName() == screenName)
            .findFirst()
            .orElse(null);
        return this.delete(usr);
    }

    public boolean delete(Usuario usuario) {
        return this.usuarios.remove(usuario);
    }
}
