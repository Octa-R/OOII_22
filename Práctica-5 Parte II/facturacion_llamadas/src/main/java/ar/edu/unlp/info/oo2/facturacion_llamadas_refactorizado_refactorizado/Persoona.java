package ar.edu.unlp.info.oo2.facturacion_llamadas_refactorizado_refactorizado;

import java.util.ArrayList;
import java.util.List;

public class Persoona {
	public List<Llamada> llamadas = new ArrayList<Llamada>();
	public String telefono;
	public String nombre;
	public String cuit;

	public Persoona(String nombre, String telefono){
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDocumento() {
		return cuit.substring(2,cuit.length() - 1);
	}

	public String getTelefono() {
		return telefono;
	}

	public double calcularMontoTotalLlamadas() {
		return llamadas.stream()
				.mapToDouble(llamada -> llamada.calcularCosto())
				.sum();
	}
}
