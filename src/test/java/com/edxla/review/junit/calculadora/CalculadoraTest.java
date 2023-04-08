package com.edxla.review.junit.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest  {
	
	Calculadora calc;
	
	@BeforeAll
	public static void primero() 
	{
		System.out.println("Se ejecuta al principio de todas las pruebas unitarias, por unica vez");
	}
	
	@AfterAll
	public static void ultimo() 
	{
		System.out.println("Se ejecuta al final de todas las pruebas unitarias, por unica vez");
	}
	
	@BeforeEach
	public void instanciaObjeto() 
	{
		calc = new Calculadora();
		System.out.println("Se ejecuta al principio de cada prueba unitaria");
	}
	
	@AfterEach
	public void despuesDelTest() 
	{
		System.out.println("Se ejecuta al final de cada prueba unitaria");
		
	}
	


	@Test
	@DisplayName("Test para el metodo sumar de la calculadora")
	public void sumarTest() 
	{
		
		//Probar que el metodo sumar espera un 4
		assertEquals(4, calc.sumar(2, 2));
		
		assertNotEquals(2,calc.sumar(4, 2));
	}
	
	@Test
	@DisplayName("Test para el metodo dividir de la calculadora")
	//@Disabled("Esta prueba la desabilitaremos por el momento")
	public void dividirTest() throws Exception 
	{
	
		assertTrue(calc.dividir(10, 2) == 5);
		assertFalse(calc.dividir(8, 2) == 6);
		
	}
	
	@Test
	public void arregloTest()
	{
		String [] arre1 = {"a","b"};
		String [] arre2 = {"a","b"};
		
		@SuppressWarnings("unused")
		String [] arre3 = {"a","b","c"};
		
		assertArrayEquals(arre1, arre2);
	}
	
	@Test
	private void sameAndNotSameTest() {
		
		String str1 = "Mi cadena";
		String str2 = str1;
		String str3 = "Mi Segunda cadena";
		
		assertSame(str1, str2);
		assertNotSame(str2, str3);
		

	}
	
	@Test
	@DisplayName("Test para probar Excepciones")
	private void dividirExcepcionesTest() {
		
		assertThrows(Exception.class, ()-> {calc.dividir(10, 0);});
		
		assertDoesNotThrow( ()-> {calc.dividir(10, 30);});
	}
	
	

}
