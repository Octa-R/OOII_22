public class Juego {
    // ......mal olor...
    //en ambos metodo, estan mal asignadas las responsabilidades
    // Feature Envy
    public void incrementar(Jugador j) {
        j.puntuacion = j.puntuacion + 100;
    }
    public void decrementar(Jugador j) {
        j.puntuacion = j.puntuacion - 50;
    }
}
//mal olor DATA CLASS
//generalmente es porque hay que agregarle comportamiento
public class Jugador {
    public String nombre;
    public String apellido;
    public int puntuacion = 0;
}

// Refactoring


public class Jugador {
    public String nombre;
    public String apellido;
    public int puntuacion = 0;
    //Move Method
    //Mueve un metodo de una clase a otra
    public void incrementar(){
        puntuacion += 100;
    }
    
    public void decrementar() {
        puntuacion -+ 50;
    }
}
