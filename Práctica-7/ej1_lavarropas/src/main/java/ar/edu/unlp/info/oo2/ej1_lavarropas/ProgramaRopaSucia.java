package ar.edu.unlp.info.oo2.ej1_lavarropas;

public class ProgramaRopaSucia implements ProgramaDeLavado{

    @Override
    public void iniciarLavado(Lavarropas lavarropas) {
        lavarropas.agregarAgua(100);
        lavarropas.agregarJabonEnPolvo();
        lavarropas.lavar(100);
        lavarropas.vaciarAgua();

        lavarropas.agregarAgua(100);
        lavarropas.agregarJabonEnPolvo();
        lavarropas.lavar(30);
        lavarropas.vaciarAgua();

        lavarropas.agregarAgua(100);
        lavarropas.agregarEnjuague();
        lavarropas.enjuaga(15);

        lavarropas.vaciarAgua();
        lavarropas.centrifugar(10);
    }

}
