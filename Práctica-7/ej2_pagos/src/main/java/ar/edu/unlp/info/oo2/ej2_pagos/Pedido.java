package ar.edu.unlp.info.oo2.ej2_pagos;

public class Pedido {
    double monto;
    MedioDePago medioDePago;
    private Cliente cliente;

    public double monto(){
        return monto;
    }
    public void pagarCon(MedioDePago medioDePago ) {
        this.medioDePago = medioDePago;
    }
    public boolean pagar() {
        return medioDePago.pagar(cliente,this.monto());
    }
}
