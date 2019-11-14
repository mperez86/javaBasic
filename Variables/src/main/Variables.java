package main;

public class Variables {

	public static void main(String[] args) {
		/*
		 * Tipos de datos
		 * Enteros
		 * Decimales
		 * Caracteres
		 * Booleanos
		 */

		int version;
		version = 12;
		version = 13;

		System.out.println(version);
		
		int versionJava = 10;
		System.out.println(versionJava);
		
		float versionEspecific = 13.1f;
		System.out.println(versionEspecific);

		char letter = 'a';
		char letterNum = 97;
		System.out.println(letter);
		System.out.println(letterNum);
		
		boolean value1 = true;
		boolean value2 = false;

		// Declaración múltiples variables cuando son del mismo tipo;
		int v1 = 1, v2 = 2, v3 = 3;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);

		// Constantes asignamos el valor una vez, si no da error
		final float pi = 2.1415f, e = 8.9f;
		System.out.println(pi);

	}

}
