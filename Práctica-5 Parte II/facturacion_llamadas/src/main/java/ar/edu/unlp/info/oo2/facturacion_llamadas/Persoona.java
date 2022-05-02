package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Persoona {
	// bad smells los nombres no son autoexplicativos
	public List<Llamada> lista1 = new ArrayList<Llamada>();
	// t es tipo
	public String t;
	//nya en realidad es el nombre
	public String nya;
	//tel es telefono
	public String tel;
	public String cuit;
	public String doc;
	//sis es sistema
	//persoona conoce a persoonal y persoonal conoce a persona
	//no hay bajo acoplamiento
	public Persoonal sis;
	
	public List<Llamada> getLista1() {
		return lista1;
	}
	public void setLista1(List<Llamada> lista1) {
		this.lista1 = lista1;
	}
	public String getT() {
		return t;
	}
	public void setT(String t) {
		this.t = t;
	}
	public String getNya() {
		return nya;
	}
	public void setNya(String nya) {
		this.nya = nya;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getDoc() {
		return doc;
	}
	public void setDoc(String doc) {
		this.doc = doc;
	}
	

	
}
