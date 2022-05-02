package ar.edu.unlp.info.oo2.facturacion_llamadas_refactorizado_refactorizado;

public class PersonaJuridica extends Persoona {
    String cuit;
    public PersonaJuridica(String nombre, String telefono, String cuit) {
        super(nombre, telefono);
        this.cuit = cuit;
    }
}
