package ar.edu.unlp.info.oo2.ej3_proyectos;

import java.util.List;

public class Proyecto {
    private String nombre;
    private double montoAAlcanzar;
    private Emprendedor emprendedor;
    private List<Double> inversiones;
    private ProyectoState state;

    public Proyecto(String nombre,Emprendedor emprendedor) {
        this.nombre = nombre;
        this.emprendedor = emprendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMontoAAlcanzar() {
        return montoAAlcanzar;
    }

    public boolean invertir(double montoInversion) {
        return this.state.invertir(this,montoInversion);
    }

    public boolean cancelar() {
        return this.state.cancelar(this);
    }

    boolean addInversion(double monto) {
        return this.inversiones.add(monto);
    }
    
    public double getMontoInversiones(){
        return inversiones.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
    }

    public void setState(ProyectoState stateCancelado) {
        this.state = state;
    }
}
