package ar.edu.unlp.info.oo2.ej3_proyectos;

public class StateCancelado implements ProyectoState {
    @Override
    public boolean invertir(Proyecto proyecto,double monto) {
        return false;
    }

    @Override
    public boolean cancelar(Proyecto proyecto) {
        return true;
    }
}
