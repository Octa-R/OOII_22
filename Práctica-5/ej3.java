public class EmpleadoTemporario {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    public double horasTrabajadas = 0;
    public int cantidadHijos = 0;
    // ......
    
    public double sueldo() {
        return this.sueldoBasico 
                + (this.horasTrabajadas * 500) 
                + (this.cantidadHijos * 1000) 
                - (this.sueldoBasico * 0.13);
    }
}
//---
public class EmpleadoPlanta {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    public int cantidadHijos = 0;
    // ......
    
    public double sueldo() {
        return this.sueldoBasico 
        + (this.cantidadHijos * 2000) 
        - (this.sueldoBasico * 0.13);
    }
}
//-----
public class EmpleadoPasante {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    // ......
    
    public double sueldo() {
        return this.sueldoBasico 
        - (this.sueldoBasico * 0.13);
    }
}

// EXTRACT SUPERCLASS

public abstract class Empleado {}

public class EmpleadoPasante extends Empleado {}

public class EmpleadoPlanta extends Empleado {}

public class EMpleadoTemporario extends Empleado {
    public double horasTrabajadas = 0;
}


// Pull Up Field
public class Empleado {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    public int cantidadHijos = 0;
}
//Pull Up Method
// se vuelve la clase abstracta con el metodo sueldo abstracto
public abstract class Empleado {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    public int cantidadHijos = 0;
    
    //template method
    abstract public double sueldo();
    
    public double getBasico(){
        return this.sueldoBasico;
    }
    
    public double getDescuento() {
        return this.sueldoBasico * 0.13;
    }
    
    abstract public double getAdicionalHijos();
    
}
// Template Method sueldo pasaria a ser el template
public class EmpleadoPasante extends Empleado {
    public double sueldo() {
        return this.getBasico() - this.getDescuento();
    }
}

public class EmpleadoPlanta extends Empleado {
    public double sueldo() {
        return this.getBasico() 
            + this.getAdicionalHijos()
            - this.getDescuento();
    }
    
    @Override
    public double getAdicionalHijos() {
        return this.cantidadHijos * 2000;
    }
}

public class EMpleadoTemporario extends Empleado {
    public double horasTrabajadas = 0;
    
    public double sueldo() {
        return this.getBasico()
            + this.getAdicionalHorasTrabajadas()
            + this.getAdicionalHijos()
            - this.getDescuento();
    }
    
    @Override
    public double getAdicionalHijos() {
        return this.cantidadHijos * 500;
    }
    
    public double getAdicionalHorasTrabajadas() {
        return this.horasTRabajadas * 500;
    }
}

