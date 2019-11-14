package main;

public class Main {

	public static void main(String[] args) {
		// While
		int contador = 1;
		
		while (contador <= 10) {
			System.out.println("Hola mundo v." + contador);
			contador++;
		}
		
		contador = 0;
		int numero = 1234567890;
		
		while ( numero > 0) {
			numero = numero / 10;
			contador++;
		}
		
		System.out.println("El número tiene " + contador + " dígitos.");
	}

}
