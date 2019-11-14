package main;

public class Main {

	public static void main(String[] args) {
		// Escope
		// las variables se declaran por bloques. Por ejem, si la declaramos dentro del if no pueden
		// ser utilizadas fuera
		int promedio = 10;
		
		if (promedio > 7) {
			String mensaje = "Felicidades, tu promedio es de " + promedio;
			
			if (promedio == 10) {
				System.out.println(mensaje);
				String mensaje2;
				
				if (true) {
					mensaje2 = "esta se puede usar aquí";
				}
			}
		}
	}

}
