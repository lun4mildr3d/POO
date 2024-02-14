package com.mycompany.banco;

public class CuentaBancaria {
    //1. Crear la clase 
    //2. Definir los atributos
    int numCuenta;
    String nombCliente;
    float saldo;
    int cvv;

    public CuentaBancaria(int numCuenta, String nombCliente, float saldo, int cvv) {
        this.numCuenta = numCuenta;
        this.nombCliente = nombCliente;
        this.saldo = saldo;
        this.cvv = cvv;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNombCliente() {
        return nombCliente;
    }

    public void setNombCliente(String nombCliente) {
        this.nombCliente = nombCliente;
    }

    public float consultarSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numCuenta=" + numCuenta + ", nombCliente=" + nombCliente + ", saldo=" + saldo + ", cvv=" + cvv + '}';
    }
    
    //metdod depoditar recibe una cantidad que 
    //se sumara al saldo 
    void depositar (double cantidad) {
        saldo += cantidad;
        //la instruccion equivale a
        // saldo=saldo+cantidad
        
    }
    //metodo retirar recibe una cantidad que
    //se restara al saldo 
    void retirar (double cantidad){
        if (haysaldo(cantidad))
        saldo -= cantidad;
        else
            System.out.println("fondos insuficientes");
    }
    //el metodo hay saldo retorna verdadero si
    //EL SALDO ES MAYOR O IGUAL A UNA CANTIDAD
    //lo retorna falso en caso contrario
    boolean haysaldo(double cantidad){
        if (saldo >= cantidad)
            return true;
        else
            return false;
            
            
        }
    }

