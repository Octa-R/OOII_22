package ar.edu.unlp.info.oo2.ej1_lavarropas;

public class Lavarropas {
    ProgramaDeLavado programa;
    public void agregarAgua(int porcentaje) {}
    public void agregarJabonEnPolvo() {}
    public void lavar(int minutos) {}
    public void vaciarAgua() {}
    public void agregarEnjuague() {}
    public void enjuaga(int minutos) {}
    public void centrifugar(int minutos) {}

    public void setPrograma(ProgramaDeLavado programa) {
        this.programa = programa;
    }
    public void iniciarLavado() {
        this.programa.iniciarLavado(this);
    }
}
