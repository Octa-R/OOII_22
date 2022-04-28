package ar.edu.unlp.info.oo2.ej3_dispositivoMovil;

public class WifiConn implements Connection {
    String pict;

    @Override
    public String sendData(String data, Integer crc) {
        return "se transmite la data: "+data+" por wi-fi, crc: " + crc;
    }

    @Override
    public String pict() {
        return this.pict;
    }
}
