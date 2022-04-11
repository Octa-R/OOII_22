package ar.edu.unlp.info.oo2.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Socio> socios;
	// private VoorheesExporter exporter;
	private Exporter exporter;

	public Biblioteca(Exporter exporter) {
		socios = new ArrayList<>();
		// exporter = new VoorheesExporter(); 
		this.exporter = exporter;
	}

	public void agregarSocio(Socio socio) {
		socios.add(socio);
	}

	/**
	 * Retorna la representación JSON de la colección de socios.
	 */
	public String exportarSocios() {
		return exporter.exportar(socios);
	}

	public Exporter getExporter() {
		return this.exporter;
	}

	public void setExporter(Exporter exporter) {
		this.exporter = exporter;
	}
}
