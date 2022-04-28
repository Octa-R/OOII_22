package ar.edu.unlp.info.oo2.ej3_dispositivoMovil;

public class Adapter4GConnection implements Connection {
    Connection4G adaptee;

    Adapter4GConnection(){
        this.adaptee = new Connection4G();
    }
    @Override
    public String sendData(String data, Integer crc) {
        return this.adaptee.transmit(data,crc);
    }

    @Override
    public String pict() {
        return this.adaptee.symb();
    }
}
