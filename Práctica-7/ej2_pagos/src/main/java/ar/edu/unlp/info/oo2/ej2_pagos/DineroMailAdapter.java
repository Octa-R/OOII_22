package ar.edu.unlp.info.oo2.ej2_pagos;

public class DineroMailAdapter implements MedioDePago{
    DineroMailGateway dineroMailGateway;
    public DineroMailAdapter(DineroMailGateway dineroMailGateway) {
        this.dineroMailGateway = dineroMailGateway;
    }
    @Override
    public boolean pagar(Cliente cliente,double monto) {
        return dineroMailGateway.realizarPagoParaEmail(cliente.getEmail(), monto);
    }
}
