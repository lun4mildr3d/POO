package com.mycompany.ejercicioherencia1;

import java.time.LocalDate;

public class ProductoFresco extends Producto {
    LocalDate fechaEnv;
    String PaisYOrigen;

    public ProductoFresco(LocalDate fechaEnv, String PaisYOrigen, LocalDate fechaCad, String NumLote) {
        super(fechaCad, NumLote);
        this.fechaEnv = fechaEnv;
        this.PaisYOrigen = PaisYOrigen;
    }

    public LocalDate getFechaEnv() {
        return fechaEnv;
    }

    public void setFechaEnv(LocalDate fechaEnv) {
        this.fechaEnv = fechaEnv;
    }

    public String getPaisYOrigen() {
        return PaisYOrigen;
    }

    public void setPaisYOrigen(String PaisYOrigen) {
        this.PaisYOrigen = PaisYOrigen;
    }

    @Override
    public String toString() {
        return "ProductoFresco{" + "fechaEnv=" + fechaEnv + ", PaisYOrigen=" + PaisYOrigen + '}';
    }

    

   
    
    
    
}
