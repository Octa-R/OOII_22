package ar.edu.unlp.info.oo2.facturacion_llamadas_refactorizado_refactorizado;

//	Bad Smell Data Class

public abstract class Llamada {
	private Persoona emisor;
	private Persoona remitente;
	private int duracion;
	public Llamada() {}
	//se elimino p3 que no se usaba
	public Llamada(Persoona emisor, Persoona remitente, int duracion) {
		this.emisor = emisor;
		this.remitente = remitente;
		this.duracion = duracion;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setEmisor(Persoona q) {
		emisor = q;
	}
	public Persoona getEmisor() {
		return emisor;
	}
	public Persoona getRemitente() {
		return remitente;
	}
	public void setRemitente(Persoona remitente) {
		this.remitente = remitente;
	}

	abstract public double calcularCosto();


}
