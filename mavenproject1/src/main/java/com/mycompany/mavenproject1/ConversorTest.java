package com.mycompany.mavenproject1;

/**
 *
 * @author elise
 */
import org.junit.*;

public class ConversorTest {

    private static Conversor conversor;

    @BeforeClass
    public static void setUpClass() {
        conversor = new Conversor();
        System.out.println("🔹 Bienvenido a los tests del Conversor");
    }

    @Before
    public void setUp() {
        System.out.println("🔸 Ejecutando: " + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test
    public void testConvertirMoneda() {
        double resultado = conversor.convertirMoneda(1000, 1200); // 1000 * 1200
        assertEquals(1200000, resultado, 0.001);
    }

    @Test
    public void testAumentarSaldo() {
        double resultado = conversor.aumentarSaldo(500, 200); // 500 + 200
        assertEquals(700, resultado, 0.001);
    }

    @Test
    public void testRetirarDolaresFisico() {
        double resultado = conversor.retirarDolaresFisico(2100, 100); // 2100 - (100 * 21)
        assertEquals(0, resultado, 0.001);
    }

    @After
    public void tearDown() {
        System.out.println("🔻 Prueba finalizada, campos en 0");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("✅ Todas las pruebas han finalizado");
    }
}
