package ar.edu.unlp.info.oo2.ej1_lavarropas;

public class ProgramaRopaDelicada implements ProgramaDeLavado{
    @Override
    public void iniciarLavado(Lavarropas lavarropas) {
        lavarropas.agregarAgua(100);
        lavarropas.agregarJabonEnPolvo();
        lavarropas.lavar(40);
        lavarropas.vaciarAgua();

        lavarropas.agregarAgua(100);
        lavarropas.agregarEnjuague();
        lavarropas.enjuaga(15);

        lavarropas.vaciarAgua();
    }

}
