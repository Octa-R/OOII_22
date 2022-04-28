package ar.edu.unlp.info.oo2.ej3_dispositivoMovil;

import java.util.zip.CRC32;

public class CRC32_Calculator implements CRCCalculator{
    public long crcFor(String data) {
        CRC32 crc = new CRC32();
        crc.update(data.getBytes());
        return crc.getValue();
    }
}
