package main;

public class Main {

	public static void main(String[] args) {
		// Concatenar String
		String nombre = "Codi";
		String curso = "Curso de Java 9";
		
		String mensaje = "Hola, bienvenido ".concat(nombre);
		mensaje = mensaje.concat(" al ");
		mensaje = mensaje.concat(curso);
		mensaje = mensaje.concat(".");
		
		System.out.println(mensaje);
		
		mensaje = "Hola, bienvenido " + nombre + " al " + curso + ".";
		System.out.println(mensaje);
	}

}
