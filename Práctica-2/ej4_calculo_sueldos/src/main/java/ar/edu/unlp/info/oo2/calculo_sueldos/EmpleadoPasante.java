package ar.edu.unlp.info.oo2.calculo_sueldos;

public class EmpleadoPasante extends Empleado {
    private int examenesRendidos;
    @Override
    public double calcularBasico() {
        return 20000;
    }

    //pasante solo suma por cada examen rendido
    @Override
    public double calcularAdicionalExamenes() {
        return this.examenesRendidos * 2000;
    }

    @Override
    public double calcularAdicionalCasado() {
        return 0;
    }

    @Override
    public double calcularAdicionalHijos() {
        return 0;
    }

    @Override
    public double calcularAdicionalAntiguedad() {
        return 0;
    }

    public void setExamenesRendidos(int e){
        this.examenesRendidos = e;
    }
    
}
