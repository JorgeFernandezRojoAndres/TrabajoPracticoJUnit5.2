package com.mycompany.monedatest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class DolaritosTest {

    private double saldoInicial;
    private double monto;
    private double esperadoAumento;
    private double billete;
    private double esperadoRetiro;

    public DolaritosTest(double saldoInicial, double monto, double esperadoAumento, double billete, double esperadoRetiro) {
        this.saldoInicial = saldoInicial;
        this.monto = monto;
        this.esperadoAumento = esperadoAumento;
        this.billete = billete;
        this.esperadoRetiro = esperadoRetiro;
    }

    // Datos de prueba
    @Parameterized.Parameters
    public static Collection<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][] {
            {180000, 1500, 181500, 100, 0},
            {120, 120000, 120120, 20, 0},
            {0, 0, 0, 50, 0},
            {100000, -900, 99100, 1000, 0},
            {2110, 0, 2110, 100, 10} // 2110 - (100 * 21) = 10
        });
    }

    @Test
    public void testAumentarSaldo() {
        Conversor c = new Conversor();
        double resultado = c.aumentarSaldo(saldoInicial, monto);
        System.out.println("Aumentar saldo: saldoInicial=" + saldoInicial + ", monto=" + monto + " → esperado=" + esperadoAumento);
        Assert.assertEquals(esperadoAumento, resultado, 0.001);
    }

    @Test
    public void testRetirarDolaresFisico() {
        Conversor c = new Conversor();
        double resultado = c.retirarDolaresFisico(saldoInicial, billete);
        System.out.println("Retirar físico: saldo=" + saldoInicial + ", billete=" + billete + " → esperado=" + esperadoRetiro);
        Assert.assertEquals(esperadoRetiro, resultado, 0.001);
    }
}
