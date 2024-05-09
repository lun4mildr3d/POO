package com.mycompany.practica02excepciones;

public class Practica02Excepciones {

    public static void main(String[] args) {
        atrapandoExcepciones();
        
      
    }
    public static void atrapandoExcepciones(){
try{
System.out.println("Convertido: " + convertir("1"));
}
catch(NumberFormatException e){
System.out.println("No puedo realizar la conversión");
}
}
    /*Método que lanza una excepción con un mensaje diferente*/
public static int convertir(String dato) throws NumberFormatException{
int convertido = 0;
convertido = Integer.parseInt(dato);
return convertido;
}


}
