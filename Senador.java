package com.mycompany.legisladores;

public class Senador extends Legislador {

    public Senador(String ProvinciaQueRepresenta, String nombre, int edad, String domicilio) {
        super(ProvinciaQueRepresenta, nombre, edad, domicilio);
    }
    @Override
    String getCamaraEQT(){
        return "Trabajar en la camara de Senadores";
    }
    
}
