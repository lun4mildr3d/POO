package com.mycompany.ejercicioherencia1;

import java.time.LocalDate;

public class ProductoCongelado extends Producto {
    Float Tempertura;

    public ProductoCongelado(Float Tempertura, LocalDate fechaCad, String NumLote) {
        super(fechaCad, NumLote);
        this.Tempertura = Tempertura;
    }

    public Float getTempertura() {
        return Tempertura;
    }

    public void setTempertura(Float Tempertura) {
        this.Tempertura = Tempertura;
    }

    @Override
    public String toString() {
        return "ProductoCongelado{" + "Tempertura=" + Tempertura + '}';
    }
    
    
    
}
