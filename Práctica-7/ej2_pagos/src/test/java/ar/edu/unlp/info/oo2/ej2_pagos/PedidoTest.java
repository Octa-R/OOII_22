/**
 * 
 */
package ar.edu.unlp.info.oo2.ej2_pagos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PedidoTest {

	Cliente james;
	Cliente guido;
	Pedido pedido1;

	@BeforeEach
	void setUp() throws Exception {
		james = new Cliente("James", "Glossing","432432","emal@email.com");
		guido = new Cliente("Guido", "van Rossum","123234","asd@email.com");
		pedido1 = new Pedido(james,1200);
	}


	@Test
	void pagarConDebitoTest(){
		pedido1.pagarCon(new DebitoAdapter());
		pedido1.pagar();
	}
}
