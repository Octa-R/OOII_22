package ar.edu.unlp.info.oo2.facturacion_llamadas_refactorizado_refactorizado;

public class PersonaFisica extends Persoona{
    String documento;
    public PersonaFisica(String nombre, String telefono,String documento) {
        super(nombre, telefono);
        this.documento = documento;
    }
}
