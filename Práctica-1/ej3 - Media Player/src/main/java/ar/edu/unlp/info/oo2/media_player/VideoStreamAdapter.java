package ar.edu.unlp.info.oo2.media_player;
//adaptador
public class VideoStreamAdapter extends Media {

    private VideoStream adaptee;
    public VideoStreamAdapter(VideoStream vStream) {
        this.adaptee = vStream;
    }

    public void play() {
        adaptee.reproduce();
    }
    
}
