
package com.mycompany.geometria;


public class FigurasGeometrica {
    int puntoX;
    int puntoy;
    int tamanoBorde;
    String colorBorde;
    String colorRelleno;

    public FigurasGeometrica(int puntoX, int puntoy, int tamanioBorde, String colorBorde, String colorRelleno) {
        this.puntoX = puntoX;
        this.puntoy = puntoy;
        this.tamanoBorde = tamanioBorde;
        this.colorBorde = colorBorde;
    }

    public int getPuntoX() {
        return puntoX;
    }

    public void setPuntoX(int puntoX) {
        this.puntoX = puntoX;
    }

    public int getPuntoy() {
        return puntoy;
    }

    public void setPuntoy(int puntoy) {
        this.puntoy = puntoy;
    }

    public int getTamanoBorde() {
        return tamanoBorde;
    }

    public void setTamanoBorde(int tamanoBorde) {
        this.tamanoBorde = tamanoBorde;
    }

    public String getColorBorde() {
        return colorBorde;
    }

    public void setColorBorde(String colorBorde) {
        this.colorBorde = colorBorde;
    }

    public String getColorRelleno() {
        return colorRelleno;
    }

    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    @Override
    public String toString() {
        return "Figuras Geometrica { " + "punto X=" + puntoX + ", punto y=" + puntoy + ", tamano del Borde=" + tamanoBorde + ", color Borde=" + colorBorde + ", color Relleno=" + colorRelleno + '}';
    }
    
}
