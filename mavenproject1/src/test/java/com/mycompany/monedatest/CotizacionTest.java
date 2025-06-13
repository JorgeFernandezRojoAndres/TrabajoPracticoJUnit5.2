package com.mycompany.monedatest;

import org.junit.Assert;
import org.junit.Test;

public class CotizacionTest {
    @Test(expected = ArithmeticException.class)
    public void testCotizarCero() {
        System.out.println("-------------------------------------");
        Conversor c = new Conversor();
        try {
        System.out.println("CotizacionTest: intentando dividir por cero");
        c.cotizar(1000, 0); // debería lanzar excepción
        // Si no lanza excepción, el test falla
        Assert.fail("No se lanzó la excepción esperada");
    } catch (ArithmeticException e) {
        System.out.println("✅ Se lanzó la excepción esperada: " + e.getMessage());
        Assert.assertEquals("División por cero", e.getMessage());
    }
        System.out.println("-------------------------------------");
    }
}
