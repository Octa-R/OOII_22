package ar.edu.unlp.info.oo2.calculo_sueldos;

public class EmpleadoTemporario  extends Empleado {
    
    private int horasTrabajadas;

    @Override
    public double calcularBasico() {
        return 20000 + (horasTrabajadas * 300);
    }

    public void setHorasTrabajadas(int horas) {
        this.horasTrabajadas = horas;
    }
    //el temporario no suma por antiguedad ni por examenes
    @Override
    public double calcularAdicionalExamenes() {
        return 0;
    }

    @Override
    public double calcularAdicionalAntiguedad() {
        return 0;
    }

}
