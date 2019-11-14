package main;

import java.util.Arrays;


public class Ejercicio1 {

	public static void main(String[] args) {
		// Crear un arreglo cual nos permita almacenar cien n�meros enteros.
		
		int arreglo[] = new int [100];
		
		// Llenar el arreglo con n�meros aleatorios.
		
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = (int)(Math.random() * 100);
		}
		
		// for each
		int mayor = 0, menor = 100, sum = 0, prom = 0;
		int primos[];
		int pares[];
		
		System.out.println("Numeros pares: ");
		for (int item : arreglo) {
			sum += item;
			if (item > mayor)
				mayor = item;
			if (item < menor)
				menor = item;
			if (item % 2 == 0) 
				System.out.print(item + "  ");
				
		}
		System.out.println("");
		prom = sum / arreglo.length;

		// Mostrar en consola el n�mero mayor.
		System.out.println("El n�mero mayor es: " + mayor);
		// Mostrar en consola el n�mero menor
		System.out.println("El n�mero menor es: " + menor);
		// Mostrar en consola el promedio del arreglo.
		System.out.println("El promedio es " + prom);
		// Mostrar en consola todos los n�meros primos.
		System.out.println("Numeros primos: ");
		
		boolean existeCien = false;
		
		for (int item : arreglo) {
			if (item == 100) 
				existeCien = true;
				
			int cont = 0;
			for (int i = 1; i <= item; i++)  {
				if (item % i == 0)
					cont++;
			}
			if (cont <= 2)
				System.out.print(item + " ");
			
		}
		System.out.println("");
		// Mostrar en consola la suma del primer y �ltimo elemento del arreglo.
		int suma = arreglo[0] + arreglo[arreglo.length - 1];
		System.out.println("La suma del primero y el �ltimo es " + suma);
		
		// Mostrar en consola el mensaje "Existe cien" en dado caso el arreglo almacene por los menos un cien.
		if (existeCien)
			System.out.println("Existe cien");

		// Mostrar en consola el arreglo de forma ascendente.
		Arrays.sort(arreglo);
		System.out.println("El array ascendente ");
		for (int num : arreglo) {
			System.out.print(num + " ");
		}
	}

}
