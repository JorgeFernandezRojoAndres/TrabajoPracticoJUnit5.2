/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
/**
 *
 * @author LEITO
 */
@RunWith(value = Parameterized.class)
public class DolaritosTest {
    private double saldoInicial;
    private double montoAumento;
    private double expectedSuma;

    // Se inicializa una instancia de ConversorJUnit para cada conjunto de parámetros
    private ConversorJUnit conversor = new ConversorJUnit();

    // Constructor que JUnit usa para inyectar los parámetros de cada prueba
    public DolaritosTest(double saldoInicial, double montoAumento, double expectedSuma) {
        this.saldoInicial = saldoInicial;
        this.montoAumento = montoAumento;
        this.expectedSuma = expectedSuma;
    }

    // Método que proporciona los datos para las pruebas parametrizadas
    @Parameters
    public static Collection<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][]{
            // { saldoInicial, montoAumento, expectedSuma }
            {100.0, 50.0, 150.0},        // Caso básico de suma
            {0.0, 100.0, 100.0},         // Sumar a un saldo cero
            {500.0, 0.0, 500.0},         // Sumar cero
            {1000.0, -200.0, 800.0},     // Resta (sumar un valor negativo)
            {75.50, 24.50, 100.0},       // Números decimales
            {1000000.0, 500000.0, 1500000.0} // Valores grandes
        });
    }

    // Método de prueba que usa los parámetros para testear 'aumentarSaldo'
    @Test
    public void testSumaAumentarSaldo() {
        double actualSuma = conversor.aumentarSaldo(saldoInicial, montoAumento);
        assertEquals(expectedSuma, actualSuma, 0.001); // Se usa un delta de 0.001 para la comparación
    }
}
