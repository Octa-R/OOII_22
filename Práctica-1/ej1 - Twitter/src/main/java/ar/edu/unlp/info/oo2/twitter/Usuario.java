package ar.edu.unlp.info.oo2.twitter;

import java.util.List;
import java.util.ArrayList;

public class Usuario {

    private List<Tweet> tweets = new ArrayList<>();
    private String screenName;

    public Usuario(String screenName) {
        this.screenName = screenName;
    }

    public String getScreenName() {
        return this.screenName;
    }

    
    public boolean tweetear(String texto) {
        if(this.textoEsValido(texto)) {
            Tweet newTweet = new Tweet(texto);
            this.tweets.add(newTweet);
            return true;
        }
        return false;
    }
    //validación del tweet
    private boolean textoEsValido(String texto) {
        return texto.length() >= 1 && texto.length() <= 140;
    }
    
}
