package ar.edu.unlp.info.oo2.proyecto_ejemplo;

public class EmpleadoPlanta extends Empleado {
    
    private int antiguedad;

    @Override
    public double calcularBasico() {
        return 50000;
    }
    
    //planta suma por anios de antiguedad ademas de por hijo y si esta casadx
    @Override
    public double calcularAdicionalAntiguedad() {
        return this.antiguedad * 2000;
    }
    
    @Override
    public double calcularAdicionalExamenes() {
        return 0;
    }
    
}
