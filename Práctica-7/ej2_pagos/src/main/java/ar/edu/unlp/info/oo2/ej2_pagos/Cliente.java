package ar.edu.unlp.info.oo2.ej2_pagos;

public class Cliente {
    private String nombre;
    private String apellido;
    private String CBU;
    private String email;
    public Cliente(String nombre,String apellido,String CBU,String email) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.CBU = CBU;
        this.email = email;
    }

    public String getCBU() {
        return CBU;
    }

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
