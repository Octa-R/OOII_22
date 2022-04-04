package ar.edu.unlp.info.oo2.twitter;

public class Tweet {

    private String texto;
    private Tweet reTweetDe;

    public Tweet(String texto) {
        this.setContenido(texto);
    }
    
    public Tweet(String texto, Tweet reTweetDe) {
        this.setContenido(texto);
        this.reTweetDe = reTweetDe;
    }

    public boolean setContenido(String texto) {
        if(texto.length() >= 1 && texto.length() <= 140) {
            this.texto = texto;
            return true;
        }
        return false;
    }

    public Tweet getReTweetDe() {
        return reTweetDe;
    }
    public String getTexto() {
        return texto;
    }

    public Tweet reTweetear() {
        return this;
    }
    
}
