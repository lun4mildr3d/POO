
package com.mycompany.geometria;

public class Circulo extends FigurasGeometrica{
    float radio;

    public Circulo(float radio, int puntoX, int puntoY, int tamanioBorde, String colorBorde, String colorRelleno) {
        super(puntoX, puntoY, tamanioBorde, colorBorde, colorRelleno);
        this.radio = radio;
    }
    public void dibujar() {
        System.out.println("Dibijando circulo");
    }
    double calcularArea(){
        double area;
        area = 3.1416 * (radio * radio);
        return area;
    }
    double calcularPerimetro(){
        double Perimetro;
        double diametro;
        diametro = radio * 2;
        Perimetro = 3.1416 * diametro;
        return Perimetro;
                
    }

    @Override
    public String toString() {
        return super.toString() + "Circulo { " + " radio = " + radio + '}';
    }
    

    
}
