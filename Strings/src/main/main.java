package main;

public class main {

	public static void main(String[] args) {
		// Cadenas. String no es un primitivo, es una clase.
		String mensaje = "    Hola, qu� tal? Est� hasta la e�e";
//		String mensaje2 = new String("texto");
//		System.out.println(mensaje);
		// m�todos
		int caracteres = mensaje.length();
		System.out.println(caracteres);
		
		boolean contiene = mensaje.contains("hola");
		System.out.println(contiene);
		
		boolean empieza = mensaje.startsWith("Hola");
		System.out.println(empieza);
		
		boolean finaliza = mensaje.endsWith("e�e");
		System.out.println(finaliza);
		
		String nuevo = mensaje.concat(", esto es una pasada.");
		System.out.println(nuevo);
		
		// m�todos de formato 1
		System.out.println(mensaje.toUpperCase().trim());
		System.out.println(mensaje.toLowerCase().trim());
		
		System.out.println(mensaje.trim());
		
		// m�todos de formato 2
		// enteros %d, flotantes %f, string %s
		String curso = "Java";
		mensaje = String.format("Bienvenido al curso %s", curso);
		System.out.println(mensaje);

		float valor = 10.872056f;
		mensaje = String.format("El total de %d art�culos es %.3f %s", 3,valor, "MX");
		System.out.println(mensaje);
		// printf
		System.out.printf("El total de %d art�culos es %.3f %s", 3,valor, "MX");
		
		// comparar cadenas
		String str1 = "Hola";
		String str2 = "hola";
		// str2.equals(str1) --> devuelve false porque distingue may�sculas y min�sculas
		boolean result = str2.toUpperCase().equals(str1.toUpperCase());
		System.out.println(result);
		
		result = str1.equalsIgnoreCase(str2);
		System.out.println(result);

	}

}
