package ar.edu.unlp.info.oo2.ej3_proyectos;

public interface ProyectoState {
    public boolean invertir(Proyecto proyecto, double monto);
    public boolean cancelar(Proyecto proyecto);
}
