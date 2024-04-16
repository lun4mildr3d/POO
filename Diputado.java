package com.mycompany.legisladores;

public class Diputado extends Legislador {

    public Diputado(String ProvinciaQueRepresenta, String nombre, int edad, String domicilio) {
        super(ProvinciaQueRepresenta, nombre, edad, domicilio);
    }
    @Override
    String getCamaraEQT(){
        return "Trabajar en la camara de diputados";
    }
    
    
}
