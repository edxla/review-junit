package com.edxla.review.junit.calculadora;

public class Calculadora {
	
	int sumar(int a, int b) {
		return a+b;
	}
	
	int dividir(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("El denominador debe ser distento a cero");
		}
		return a/b;
	}
	
	int multiplicar(int a, int b) {
		return a*b;
	}
	
	int restar(int a, int b) {
		return a -b;
	}

}
