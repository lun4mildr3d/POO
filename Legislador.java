package com.mycompany.legisladores;
 

public abstract class Legislador extends Persona {
    String ProvinciaQueRepresenta;

    public Legislador(String ProvinciaQueRepresenta, String nombre, int edad, String domicilio) {
        super(nombre, edad, domicilio);
        this.ProvinciaQueRepresenta = ProvinciaQueRepresenta;
    }

    @Override
    public String toString() {
        return "Legislador{" + "ProvinciaQueRepresenta=" + ProvinciaQueRepresenta + '}';
    }
    abstract String getCamaraEQT();
}
