package main;

public class Main {

	public static void main(String[] args) {
		// Sobrecarga de metodos
		
		Calculadora calc = new Calculadora();
		
		float res = calc.suma(5, 7, 9, 12 + 4.5f + 22.3f);
		System.out.println(res);

	}

}
