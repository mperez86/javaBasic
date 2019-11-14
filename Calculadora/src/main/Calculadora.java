package main;

public class Calculadora {

	// multiples valores
	public int suma(int... numeros) { // --> arreglo
		System.out.println(numeros.length);
		int suma = 0;
		for (int numero : numeros)
			suma += numero;
		return suma;
	}
	
	public float suma(float... numeros) { // --> arreglo
		System.out.println(numeros.length);
		float suma = 0;
		for (float numero : numeros)
			suma += numero;
		return suma;
	}
	
	public double suma(double... numeros) { // --> arreglo
		System.out.println(numeros.length);
		double suma = 0;
		for (double numero : numeros)
			suma += numero;
		return suma;
	}
	
	public int suma(int valor1, int valor2) {
		return valor1 + valor2;
	}
	
	public int suma(int valor1, int valor2, int valor3) {
		return valor1 + valor2 + valor3;
	}
	
	public int suma() {
		return 0;
	}
	
	public float suma(float valor1, float valor2) {
		return valor1 + valor2;
	}
	
	public double suma(double valor1, double valor2) {
		return valor1 + valor2;
	}
}
