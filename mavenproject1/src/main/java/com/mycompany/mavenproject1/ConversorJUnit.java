package com.mycompany.mavenproject1;

public class ConversorJUnit {

    public double convertirMoneda(double cantidad, double tasaCambio) {
        return cantidad * tasaCambio;
    }

    public double cotizarDolar(double pesos, double dolares) {
        if (dolares == 0) throw new ArithmeticException("División por cero");
        return pesos / dolares;
    }

    public double aumentarSaldo(double saldoInicial, double montoNuevo) {
        return saldoInicial + montoNuevo;
    }

    public double retirarDolaresFisico(double saldo, double retiro) {
        if (retiro > saldo) throw new IllegalArgumentException("Saldo insuficiente");
        return saldo - retiro;
    }

    public static void main(String[] args) {
        ConversorJUnit conversor = new ConversorJUnit();

        System.out.println("Convertir Moneda: " + conversor.convertirMoneda(1000, 1200));     // 1200000
        System.out.println("Cotizar Dólar: " + conversor.cotizarDolar(1800000, 1620));        // ~1111.11
        System.out.println("Aumentar Saldo: " + conversor.aumentarSaldo(500, 1600));          // 2100
        System.out.println("Retirar Dólares Físico: " + conversor.retirarDolaresFisico(2100, 100)); // 2000
    }
}
