/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
/**
 *
 * @author LEITO
 */@RunWith(Suite.class)
@SuiteClasses({
    // Asegúrate de que estas clases existan en tu paquete de tests
  //  ConversorTest.class,    // Clase de test básica para ConversorJUnit //LA DEBE CREAR ELISEO 
  //  CotizacionTest.class,   // Clase de test para excepciones (cotización por cero)  //LA DEBE CREAR ELISEO 
    DolaritosTest.class     // Clase de test parametrizada (tu responsabilidad)
})
public class miCoinSuite {
    
}
