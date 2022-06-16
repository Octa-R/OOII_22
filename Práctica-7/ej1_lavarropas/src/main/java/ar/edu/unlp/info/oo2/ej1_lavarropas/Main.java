package ar.edu.unlp.info.oo2.ej1_lavarropas;

public class Main {
    public static void main(String[] args) {
        Lavarropas l = new Lavarropas();
        ProgramaDeLavado sucia = new ProgramaRopaSucia(), diario = new ProgramaLavadoDiario(), delicada = new ProgramaRopaDelicada();
        l.setPrograma(sucia);
        l.iniciarLavado();
    }
    
}
