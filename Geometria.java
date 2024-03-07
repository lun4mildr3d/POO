package com.mycompany.geometria;
import java.util.Scanner;
public class Geometria {
    static Scanner entrada = new Scanner(System.in);
/*Este proyecto permitira calcular el area,
el perimetro y dibujar figura (simulado)*/
    //se crean circulos, cuadrados y trinagulos 
    public static void main(String[] args) {
        Circulo cir;
        Cuadrado cua;
        Triangulo tri;
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        do{
                System.out.println("¿Que figura desea crear? ");
            System.out.println("1. Circulo ");
            System.out.println("2. Cuadrado ");
            System.out.println("3. Triangulo ");
            System.out.println("4. Salir ");// se lee la opcion
            opcion = entrada.nextInt(); //se limpia el buffer
            
            switch (opcion){
                case 1: cir = crearCirculo();
                cir.dibujar();
                System.out.println("Area del circulo: " + cir.calcularArea());
                System.out.println("Perimetro del circulo: " + cir.calcularPerimetro());
                System.out.println("Datos del circulo: " + cir.toString());
                break;
                
                case 2: cua = crearCuadrado();
                System.out.println("Area del circulo: " + cua.calcularArea());
                System.out.println("Perimetro del circulo: " + cua.calcularPerimetro());
                System.out.println("Datos del circulo: " + cua.toString());
                break;
                
                case 3: tri = crearTriangulo();
                System.out.println("Area del triangulo: " + tri.calcularArea());
                System.out.println("Perimetro del triangulo: " + tri.calcularPerimetro());
                System.out.println("Datos del triangulo: " + tri.toString());
                break;
                
                case 4: System.out.println("bye ");
                break;
                default: System.out.println("ERROR, intetalo de nuevo ");
                
            }
            
        }while(opcion != 4);
                    

        } //fin main
     public static Circulo crearCirculo() {
            Circulo C;
            float radio;
            int puntoX, puntoY, tamanioBorde;
            String colorBorde, colorRelleno;
            System.out.println("Radio del circulo ");
            radio = entrada.nextFloat();
            System.out.println("PuntoX del circulo ");
            puntoX = entrada.nextInt();
            System.out.println("puntoY del circulo ");
            puntoY = entrada.nextInt();
            System.out.println("tamanio del Borde del circulo ");
            tamanioBorde = entrada.nextInt();
            System.out.println("color del borde del circulo ");
            colorBorde = entrada.nextLine();
            System.out.println("color del relleno del circulo ");
            colorRelleno = entrada.nextLine();
            
            C = new Circulo (radio, puntoX, puntoY, tamanioBorde, colorBorde, colorRelleno);
            return C;
        
    }
       public static Cuadrado crearCuadrado() {
            Cuadrado L;
            float lado;
            int puntoX, puntoY, tamanioBorde;
            String colorBorde, colorRelleno;
            System.out.println("lado del circulo ");
            lado = entrada.nextFloat();
            System.out.println("PuntoX del cuadrado ");
            puntoX = entrada.nextInt();
            System.out.println("puntoY del cuadrado ");
            puntoY = entrada.nextInt();
            System.out.println("tamanio del Borde del cuadrado ");
            tamanioBorde = entrada.nextInt();
            System.out.println("color del borde del cuadrado ");
            colorBorde = entrada.nextLine();
            System.out.println("color del relleno del cuadrado ");
            colorRelleno = entrada.nextLine();
            
            L = new Cuadrado (lado, puntoX, puntoY, tamanioBorde, colorBorde, colorRelleno);
            return L;         
        
    }
         public static Triangulo crearTriangulo() {
            Triangulo T;
            float Base, Altura;
            int puntoX, puntoY, tamanioBorde;
            String colorBorde, colorRelleno;
            System.out.println("Base del triangulo ");
            Base = entrada.nextFloat();
            System.out.println("PuntoX del triangulo ");
            puntoX = entrada.nextInt();
            System.out.println("puntoY del triangulo ");
            puntoY = entrada.nextInt();
            System.out.println("tamanio del Borde del triangulo ");
            tamanioBorde = entrada.nextInt();
            System.out.println("color del borde del triangulo ");
            colorBorde = entrada.nextLine();
            System.out.println("color del relleno del triangulo ");
            colorRelleno = entrada.nextLine();
            
            T = new Triangulo (Base, puntoX, puntoY, tamanioBorde, colorBorde, colorRelleno);
            return T;   
        
    }
}
