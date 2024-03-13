package com.mycompany.ejercicioherencia1;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto {
    

        String CodigoOrgSupAlim;

    public ProductoRefrigerado(String CodigoOrgSupAlim, LocalDate fechaCad, String NumLote) {
        super(fechaCad, NumLote);
        this.CodigoOrgSupAlim = CodigoOrgSupAlim;
    }

    public String getCodigoOrgSupAlim() {
        return CodigoOrgSupAlim;
    }

    public void setCodigoOrgSupAlim(String CodigoOrgSupAlim) {
        this.CodigoOrgSupAlim = CodigoOrgSupAlim;
    }

    @Override
    public String toString() {
        return "ProductoRefrigerado{" + "CodigoOrgSupAlim=" + CodigoOrgSupAlim + '}';
    }

    

    
}
