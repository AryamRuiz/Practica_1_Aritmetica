package com.example.practica_1;

public class aritmetica{
    private int numero1;
    private int numero2;

    public aritmetica(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public aritmetica() {
        this.numero1 = 0;
        this.numero2 = 0;
    }
    public aritmetica(aritmetica object) {
        this.numero1 = object.numero1;
        this.numero2 = object.numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int suma()
    {
        return numero1+numero2;
    }
    public int resta()
    {
        return numero1-numero2;
    }
    public int multiplicacion()
    {
        return numero1*numero2;
    }
    public int division()
    {
        return numero1/numero2;
    }

    @Override
    public String toString() {
        return "aritmetica{" +
                "numero1=" + numero1 +
                ", numero2=" + numero2 +
                '}';
    }
}
