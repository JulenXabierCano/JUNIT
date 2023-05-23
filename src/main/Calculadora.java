package main;

public class Calculadora {
	public Calculadora() {
	}

	public static int suma(int a, int b) {
		return a + b;
	}

	public static int resta(int a, int b) {
		return a - b;
	}

	public static int multiplicar(int a, int b) {
		return a * b;
	}

	public static double divide(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Cannot divide by zero!");
		}
		return (double) a / (double) b;
	}
}
