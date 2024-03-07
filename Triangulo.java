package com.mycompany.geometria;

public class Triangulo extends FigurasGeometrica{
    float Base,Altura;

    public Triangulo(float Base, int puntoX, int puntoy, int tamanioBorde, String colorBorde, String colorRelleno) {
        super(puntoX, puntoy, tamanioBorde, colorBorde, colorRelleno);
        this.Base = Base;
        this.Altura = Altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "Base=" + Base + ", Altura=" + Altura + '}';
    }
    void DibujarTriangulo(){
        System.out.println("Dubujando el Triangulo");
    }
    double calcularArea() {
        double Area;
        Area = (Base * Altura) / 2;
        return Area;
    }
    double calcularPerimetro(){
        double Perimetro;
        Perimetro = Base * 3;
        return Perimetro;
    }
    
}
