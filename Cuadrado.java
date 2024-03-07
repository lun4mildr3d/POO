package com.mycompany.geometria;

public class Cuadrado extends FigurasGeometrica{
    float lado;

    public Cuadrado(float lado, int puntoX, int puntoy, int tamanioBorde, String colorBorde, String colorRelleno) {
        super(puntoX, puntoy, tamanioBorde, colorBorde, colorRelleno);
        this.lado = lado;
    }

    @Override
    public String toString() {
        return super.toString() + " Cuadrado{ " + "lado = " + lado + '}';
    }
    void dubujarCuadrado(){
        System.out.println("Dubujando el Cuadrado");
        
    }
    double calcularArea(){
        double Area;
        Area = lado * lado;
        return Area;
    }
    double calcularPerimetro(){
        return lado * 4;
        
    }
  
}
