package ar.edu.unlp.info.oo2.facturacion_llamadas_refactorizado_refactorizado;

import java.util.SortedSet;
import java.util.TreeSet;
// es com una bd de telefono que se usan para cuando se da de alta un usr
// si se diera de baja un usuario, su nro se devuelve
public class GuiaTelefonica {
	public SortedSet<String> guia = new TreeSet<String>();

	public boolean agregarTelefono(String telefono) {
		return this.guia.add(telefono);
	}
	public String getTelefono() {
		String last = this.guia.last();
		this.guia.remove(last);
		return last;
	}
}
