package com.mycompany.mavenproject1;

/**
 *
 * @author elise
 */
import org.junit.Test;

public class CotizacionTest {

    @Test(expected = ArithmeticException.class)
    public void testCotizarCero() {
        Conversor conversor = new Conversor();
        conversor.calcularCotizacion(1620, 0); // división por cero
    }
}

