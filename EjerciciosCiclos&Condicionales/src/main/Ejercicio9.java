package main;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Dado un número entero obtener su factorial.
		
		int num = 8;
		long factorial = 1;
		
		for (int i = num; i > 0; i--) {
			factorial *= i; 
			System.out.print(i);
			if (i > 1)
				System.out.print("  *  ");

		}

		System.out.print( " = " + factorial);
	}

}
