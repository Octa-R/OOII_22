package ar.edu.unlp.info.oo2.ej3_proyectos;

public class StateConformado implements ProyectoState{
    @Override
    public boolean invertir(Proyecto proyecto,double monto) {
        return proyecto.addInversion(monto);
    }

    @Override
    public boolean cancelar(Proyecto proyecto) {
        return false;
    }
}
