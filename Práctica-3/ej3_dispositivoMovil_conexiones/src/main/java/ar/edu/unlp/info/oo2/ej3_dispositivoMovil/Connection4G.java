package ar.edu.unlp.info.oo2.ej3_dispositivoMovil;

public class Connection4G {
    String symb;

    public String transmit(String data,Integer crc){
        return "se transmite la data: "+ data +" por 4g, crc: " + crc;
    }

    public String symb(){
        return this.symb;
    }
}
