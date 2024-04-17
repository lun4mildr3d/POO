package com.mycompany.legisladores;
import java.util.ArrayList;

public class ListaLegisladores {
    ArrayList<Legislador> ListaLegisladores;
    public ListaLegisladores(){
        this.ListaLegisladores = new ArrayList();
    }
    void agregarLegislador(Legislador leg) {
        ListaLegisladores.add(leg);
    }
    void mostrarLegisladores(){
       for (int i = 0; i< ListaLegisladores.size(); i++){
                        Legislador legis = ListaLegisladores.get(i);
                        if(legis instanceof Senador){
                            //SE REALIZA EL CASTING (CONVERSION)
                            Senador senador = (Senador) legis;
                            System.out.println(senador.toString());
                        }else
                        {
                            
                            Diputado Dip = (Diputado) legis;
                            System.out.println(Dip.toString());
                             System.out.println(dip.getCamaraEnquetrabaja());  
                           
    }
}
    }
}
