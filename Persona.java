package com.mycompany.legisladores;

public abstract class Persona {
    String nombre;
    int edad;
    String domicilio;
    
    //Constructor 
    public Persona(String nombre, int edad, String domicilio) {
        this.nombre = nombre;
        this.edad = edad;
        this.domicilio = domicilio;
    }
    
    //toString
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", domicilio=" + domicilio + '}';
    }
    
    
}
