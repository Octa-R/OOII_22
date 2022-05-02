package ar.edu.unlp.info.oo2.facturacion_llamadas_refactorizado_refactorizado;
import java.util.ArrayList;
import java.util.List;

//Bad Smell clase grande

public class Persoonal {
	// se cambiaron a mejores nombre

	List<Persoona> usuarios = new ArrayList<Persoona>();
	List<Llamada> llamadas = new ArrayList<Llamada>();
	GuiaTelefonica guiaTelefonica = new GuiaTelefonica();
	static double descuentoJur = 0.15;
	static double descuentoFis = 0;

	public boolean agregarTelefono(String telefono) {
		// se simplifico
		return this.guiaTelefonica.agregarTelefono(telefono);
	}
	public Persoona registrarUsuario(String data, String nombre, String t) {

		Persoona nuevoUsuario;

		String telefono = guiaTelefonica.getTelefono();//Move Method

		if (t.equals("fisica")) {
			nuevoUsuario = new PersonaFisica(nombre,telefono,data);
		} else  {
			nuevoUsuario = new PersonaJuridica(nombre,telefono,data);
		}

		if(usuarios.add(nuevoUsuario)) {
			return nuevoUsuario;
		} else {
			return null;
		}
	}
	//se simplifico
	public boolean eliminarUsuario(Persoona p) {
		boolean removed = this.usuarios.remove(p);
		if(removed) {
			this.guiaTelefonica.agregarTelefono(p.getTelefono());
		}
		return removed;
	}
	//se mejoraron nombres de parametro
	public Llamada registrarLlamada(Persoona emisor, Persoona remitente, String t, int duracion) {
		Llamada llamada;
		if(t.equals("internacional")) {
			llamada = new LlamadaInternacional(emisor,remitente,duracion);
		} else {
			llamada = new LlamadaNacional(emisor,remitente,duracion);
		}
		this.llamadas.add(llamada);
		return llamada;
	}
	
	public double calcularMontoTotalLlamadas(Persoona persona) {
		boolean existe = usuarios.stream()
				.map(usuario -> usuario.getTelefono())
				.anyMatch(telefono -> telefono.equals(persona.getTelefono()));

		if(!existe) return 0;
		return persona.calcularMontoTotalLlamadas();
	}

	public int cantidadDeUsuarios() {
		return usuarios.size();
	}

	public boolean existeUsuario(Persoona persona) {
		return usuarios.contains(persona);
	}
	
}
