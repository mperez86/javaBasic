package main;

public class Main {

	public static void main(String[] args) {

		// principio de sustitucion. t y c son figuras.
		Figura t = new Triangulo(10f, 5f);		
		Figura c = new Circulo(9f);
		
		// creamos un array de tipo figura, 
		// dónde se pueden almacenar los objetos de clases que extienden a figura
		
		Figura figura[] = new Figura[2];
		
		// asignamos valores de diferentes objetos
		figura[0] = c;
		figura[1] = t;
		
		System.out.println(figura[0].area());
		System.out.println(figura[1].area());
		
//		System.out.println(t.area());
//		System.out.println(c.area());
	}

}
