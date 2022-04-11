package ar.edu.unlp.info.oo2.media_player;

import java.util.ArrayList;
import java.util.List;
//cliente
public class MediaPlayer {
    private List<Media> media;

    public MediaPlayer() {
        media = new ArrayList<>();
    }

    public boolean addMedia(Media m) {
        return this.media.add(m);
    }

    public void reproducirTodo() {
        this.media.forEach(m -> m.play());
    }


}
