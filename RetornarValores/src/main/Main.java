package main;

public class Main {

	public static void main(String[] args) {
		// Retornando valores
		
		Triangulo triangulo = new Triangulo();
		
		triangulo.altura = 10;
		triangulo.base = 20.8f;
		
		float area = triangulo.area();
		System.out.println(area);
	}

}
