package ar.edu.unlp.info.oo2.ej3_dispositivoMovil;

public class Dispositivo {
    Ringer ringer;
    Connection connection;
    Display display;
    CRCCalculator crcCalculator;

    public Dispositivo(Connection connection,CRCCalculator crc) {
        this.ringer = new Ringer();
        this.connection = connection;
        this.crcCalculator = crc;
        this.display = new Display();
    }

    public String send(String data) {
        long crc = this.crcCalculator.crcFor(data);

        return this.connection.sendData(data, (int) crc);
    }

    public void conectarCon(Connection connection) {
        this.connection = connection;
        this.display.showBanner(connection.pict());
        this.ringer.ring();
    }

    public void configurarCRC(CRCCalculator calc){
        this.crcCalculator = calc;
    }
}
