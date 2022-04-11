package ar.edu.unlp.info.oo2.proyecto_ejemplo;

public abstract class Empleado {

    private boolean casadx;
    private int cantHijos;
    //templateMethod
    public final double sueldo() {
        double basico = calcularBasico();
        double adicional = calcularAdicional();
        double descuento = calcularDescuento(basico,adicional);
        return basico + adicional - descuento;
    }

    public abstract double calcularBasico();
    //este comportamiento es el mismo en todas las subclases entonces queda implementado
    //en la clase abstracta
    public double calcularDescuento(double basico, double adicional) {
        return (basico * 0.13) + (adicional * 0.05);
    }

    //template method
    public final double calcularAdicional() {
        double adicionalExamenes = calcularAdicionalExamenes();
        double adicionalHijos = calcularAdicionalHijos();
        double adicionalAntiguedad = calcularAdicionalAntiguedad();
        double adicionalCasado = calcularAdicionalCasado();
        return adicionalAntiguedad + adicionalExamenes + adicionalHijos + adicionalCasado;
    }

    public double calcularAdicionalCasado() {
        return this.esCasadx() ? 5000 : 0;
    }

    public double calcularAdicionalHijos() {
        return this.getHijos() * 2000;
    }

    public abstract double calcularAdicionalExamenes();
    public abstract double calcularAdicionalAntiguedad();

    public int getHijos() {
        return this.cantHijos;
    }

    public boolean esCasadx() {
        return this.casadx;
    }

}
