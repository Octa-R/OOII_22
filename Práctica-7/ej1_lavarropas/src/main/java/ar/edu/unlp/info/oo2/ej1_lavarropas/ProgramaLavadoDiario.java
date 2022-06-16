package ar.edu.unlp.info.oo2.ej1_lavarropas;

public class ProgramaLavadoDiario implements ProgramaDeLavado{
    @Override
    public void iniciarLavado(Lavarropas lavarropas) {
        lavarropas.agregarAgua(50);
        lavarropas.agregarJabonEnPolvo();
        lavarropas.lavar(20);
        lavarropas.vaciarAgua();

        lavarropas.agregarAgua(50);
        lavarropas.agregarEnjuague();
        lavarropas.enjuaga(7);

        lavarropas.vaciarAgua();
        lavarropas.centrifugar(3);
    }

}
