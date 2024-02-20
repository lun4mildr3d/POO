package com.mycompany.controldececular;

public class Celular {
    String Marca;
    String Dueño;
    float Precio;
    boolean Estado;

    public Celular(String Marca, String Dueño, float Decimal, boolean Estado) {
        this.Marca = Marca;
        this.Dueño = Dueño;
        this.Precio = Precio;
        this.Estado = Estado;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getDueño() {
        return Dueño;
    }

    public void setDueño(String Dueño) {
        this.Dueño = Dueño;
    }

    public float getDecimal() {
        return Precio;
    }

    public void setDecimal(float Decimal) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Celular{" + "Marca=" + Marca + ", Due\u00f1o=" + Dueño + ", Precio=" + Precio + ", Estado=" + Estado + '}';
    }
    public void MarcarComoHabilitado();
    
            
    boolean EstaHabilitado()
    
          
    
}
