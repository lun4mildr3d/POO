package com.mycompany.legisladores;
import java.util.Scanner;

public class Legisladores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ListaLegisladores Listaleg = new ListaLegisladores ();
        int Opcion;
        do{
        System.out.println("Camara de Diputados y Senadores");
        System.out.println("Seleccione una opcion ");
        System.out.println("1. Crear Legislador");
        System.out.println("2. Motrsr Legisladores");
        System.out.println("3. Salir");
        Opcion=entrada.nextInt();
        switch(Opcion) {
            case 1: CrearLegislador(Listaleg);
            break;
            case 2: Listaleg.mostrarLegisladores();
            break;
            case 3: 
                System.out.println("Adios ");
                break;
            default: System.out.println("opcion no valida");
        
    }//fin swith
        }while (Opcion!=3);
    }//fin main
    static void CrearLegislador(ListaLegisladores ListaLeg){
        
    }
}
