package main;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Crear un programa el cual nos permita conocer el valor de la constante e.
		
		int numeroConstante = 9;
	    float e = 0f, factorial = 1f;
	    
        for (int i = 1; i <= numeroConstante; i++) {
            factorial   *= i;
            e = e+(1.0f/factorial);
        }
        System.out.println("El valor de la constante de \"e\" del número: " + numeroConstante + " es: " + e);        
	        
	}

}
