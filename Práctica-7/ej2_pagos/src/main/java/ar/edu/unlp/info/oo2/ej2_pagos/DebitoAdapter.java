package ar.edu.unlp.info.oo2.ej2_pagos;

import java.util.List;

public class DebitoAdapter implements MedioDePago{
    private DebitoGateway debitoGateway;
    public DebitoAdapter(DebitoGateway debitoGateway) {
        this.debitoGateway = debitoGateway;
    }

    @Override
    public boolean pagar(Cliente cliente,double monto) {
        List<String> errores = debitoGateway.autorizarMontoConCBU(monto, cliente.getCBU());
        if(!errores.isEmpty()) return false;
        debitoGateway.pagarMontoConCBU(monto, cliente.getCBU());
        return true;
    }
}
