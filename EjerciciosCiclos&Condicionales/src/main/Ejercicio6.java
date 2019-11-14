package main;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Imprimir en consola los primero diez números de la serie Fibonacci.
		
		int numeroSerieFibonacci = 50;
        int fibonaci = 1, termino1 = 0, termino2;
        for (int i = 1; i <= numeroSerieFibonacci; i++) {
            termino2 = termino1;
            termino1 = fibonaci + termino1;
            fibonaci = termino2;
            System.out.print(fibonaci + ", ");
        }
        System.out.println("");
	}

}
