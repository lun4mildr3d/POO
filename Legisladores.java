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
       Scanner entrada = new Scanner(System.in);
 String nombre,domicilio,provinciaQueRepresenta ;
  int edad;
  int op;
      System.out.println("Nombre?");
       Nombre =entrada.nextLine();
       System.out.println("Edad?");
        Edad =entrada.nextInt();
        entada.nextLine();
        System.out.println("Domicilio?");
        Domicilio =entrada.nextLine();
        System.out.println("Provincia que representa");
        String provinciaQueRepresenta = entada.nextLine();
        System.out.println("1. Es Diputado, 2. Es Senador");
        op = entrada.nextInt();
        if(op == 1){
            Diputado dip = new Diputado(provinciaQueRepresenta, nombre, edad, domicilio); /*Se crea un objeto o instancia dentro de la clase Diputado donde se
            almacenaran los datos ingresados por usuario*/
            
                Listaleg.agregarLegisLadores(dip); //Se usa para añadir el legislador a la lista
        } else 
            if(op == 2){
                Senador senad = new Senador(provinciaQueRepresenta, nombre, edad, domicilio); /*Se crea un objeto o instancia dentro de la clase Senador donde se
                almacenaran los datos ingresados por usuario*/
                Listaleg.agregarLegisLadores(senad); //Se usa para añadir el legislador a la lista
            }
            else 
               System.out.println("Opcion no valida, por favor ingresa una opcion correcta..."); //Si la opcion elegida no es valida
        
          
    }
}
