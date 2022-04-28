package ar.edu.unlp.info.oo2.ej3_dispositivoMovil;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispositivoTest {
    Dispositivo dispositivo;
    Connection wifi, cuatroG;
    CRCCalculator crc16, crc32;

    @BeforeEach
    void setup() {
        wifi = new WifiConn();
        cuatroG = new Adapter4GConnection();
        crc16 = new CRC16_Calculator();
        crc32 = new CRC32_Calculator();
        dispositivo = new Dispositivo(wifi,crc16);
    }

    @Test
    void sendTest() {
        String data = "datos para mandar en el dispositivo";
        long crc32Number = crc32.crcFor(data);
        long crc16Number = crc16.crcFor(data);

        //wifi crc16
        String res1 = wifi.sendData(data,(int) crc16Number);
        assertEquals(res1,dispositivo.send(data));


        //wifi crc32
        dispositivo.configurarCRC(crc32);
        String res2 = wifi.sendData(data,(int) crc32Number);
        assertEquals(res2,dispositivo.send(data));

        //4g crc16
        dispositivo.configurarCRC(crc16);
        dispositivo.conectarCon(cuatroG);
        String res3 = cuatroG.sendData(data,(int) crc16Number);
        assertEquals(res3,dispositivo.send(data));

        //4g crc32
        dispositivo.configurarCRC(crc32);
        String res4 = cuatroG.sendData(data,(int) crc32Number);
        assertEquals(res4,dispositivo.send(data));

    }

    @Test
    void configurarCRCTest(){

    }

    @Test
    void conectarConTest(){

    }


}
