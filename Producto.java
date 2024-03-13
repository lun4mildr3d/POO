package com.mycompany.ejercicioherencia1;

import java.time.LocalDate;

public class Producto {
    LocalDate fechaCad;
    String NumLote;

    public Producto(LocalDate fechaCad, String NumLote) {
        this.fechaCad = fechaCad;
        this.NumLote = NumLote;
    }

    public LocalDate getFechaCad() {
        return fechaCad;
    }

    public void setFechaCad(LocalDate fechaCad) {
        this.fechaCad = fechaCad;
    }

    public String getNumLote() {
        return NumLote;
    }

    public void setNumLote(String NumLote) {
        this.NumLote = NumLote;
    }
    
    
}
