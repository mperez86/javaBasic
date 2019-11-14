package main;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Imprimir en consola la tabla de multiplicar del número 9.
		
		int num = 9;
		
		System.out.println("Tabla de Multiplicar del " + num);
		for (int i = 1; i <= 10; i++)
			System.out.println(num + " * " + i + " = " + num*i);
	}

}
