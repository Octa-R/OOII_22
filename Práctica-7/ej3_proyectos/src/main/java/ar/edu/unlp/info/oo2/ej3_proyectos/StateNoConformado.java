package ar.edu.unlp.info.oo2.ej3_proyectos;

public class StateNoConformado implements ProyectoState{
    @Override
    public boolean invertir(Proyecto proyecto, double monto) {
        if(proyecto.getMontoInversiones() + monto >= proyecto.getMontoAAlcanzar()) {
            proyecto.setState(new StateConformado());
        }
        return proyecto.addInversion(monto);
    }

    @Override
    public boolean cancelar(Proyecto proyecto) {
        proyecto.setState(new StateCancelado());
        return true;
    }
}
