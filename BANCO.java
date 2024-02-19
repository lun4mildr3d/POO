package com.mycompany.banco;
import java.util.Scanner;
public class BANCO {

    public static void main(String[] args) {
        //CREAR UN OBJETO DE LA CLASE CUENTA BANCARIA
        //EJECUTAR TODOS LOS METODOS DESDE EL OBJETO
        int numCuenta;
        String nombCliente;
        float Saldo;
        int cvv;
        CuentaBancaria cuentaB;
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("¿numero de cuenta? ");
        numCuenta = entrada.nextInt(); //lee un entero 
        entrada.nextLine(); //limpia el buffer
        System.out.println("¿nombre del cliente? ");
        nombCliente = entrada.nextLine(); //lee un String
        System.out.println("¿saldo inicial? ");
        Saldo = entrada.nextInt(); //lee un float
        System.out.println("¿cvv? ");
        cvv = entrada.nextInt();
        cuentaB = new CuentaBancaria (numCuenta, nombCliente,Saldo,cvv);
        double cantidad;
        System.out.println("¿que cantidad desea retirar? ");
        cantidad = entrada.nextDouble();
        cuentaB.retirar(cantidad);
        System.out.println("el saldo actual es: " + cuentaB.consultarSaldo());
        System.out.println("¿que cantidad desea depositar? ");
        cantidad = entrada.nextDouble();
        cuentaB.depositar(cantidad);
        System.out.println("el saldo actual es: " + cuentaB.consultarSaldo());
        
    }
}
