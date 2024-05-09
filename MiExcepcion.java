/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica03excepciones;

/**
 *
 * @author SALA SPAFP 09
 */
public class MiExcepcion extends Exception{
    /*Constructor que regresa el mensaje que se quiere mostrar cuando ocurre la Excepción y se
lo pasa al constructor de la clase Exception */
public MiExcepcion(String mensajeError){
super(mensajeError);
}

}
