package main;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Imprimir en consola todos los números múltiplos de 2. El ciclo finalizará cuando el último múltiplo sea menor a 4570

		int res = 1, cont = 0, end = 4570;
		
		do {
			res = cont * 2;
			System.out.println(cont + " * 2 = " + res);
			cont++;
		} while (res < end);

	}

}
