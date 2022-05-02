package ar.edu.unlp.info.oo2.postapp;

import java.time.LocalDateTime;
import java.util.Date;

public class Post implements Comparable<Post>{
    String texto;
    LocalDateTime fecha;
    Usuario usuario;

    public Post(Usuario usr, String text) {
        this.fecha = LocalDateTime.now();
        this.texto=text;
        this.usuario = usr;
    }
    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
    //con esto no hay que hacer nada en el sorted
    @Override
    public int compareTo(Post o) {
        if(o.getFecha().isAfter(fecha)) {
            return 1;
        } else if (o.getFecha().isBefore(fecha)) {
            return -1;
        } else {
            return 0;
        }
    }

    public boolean perteneceA(Usuario user) {
        return usuario.equals(user) ? true : false;
    }
}
