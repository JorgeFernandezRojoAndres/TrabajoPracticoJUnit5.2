package com.mycompany.monedatest;

public class Conversor {
    public double convertirMoneda(double cantidad, double tasa) {
        return cantidad * tasa;
    }

    public double cotizar(double total, double cantidad) {
        if (cantidad == 0) {
            throw new ArithmeticException("División por cero");
        }
        return total / cantidad;
        
    }

    public double aumentarSaldo(double saldo, double cantidad) {
        return saldo + cantidad;
    }

    public double retirarDolaresFisico(double saldo, double billete) {
        return saldo - (billete * (int)(saldo / billete));
    }
}
