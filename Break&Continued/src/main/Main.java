package main;

public class Main {

	public static void main(String[] args) {
		// Break And Continue
		int valor = 101;
		
		switch(valor) {
		case 10:
			System.out.println("Es 10");
			break;
		default:
			System.out.println("No es 10");
		}
		
		for (int i = 0; i < 3; i++) {
			
			System.out.println("Siguiente " + i + ": ");
			
			for (int j = 0; j <= 100; j++) {
				
				if (j == 10) {
					break;
				}
				
				System.out.print(j + "  ");
			}
			
			System.out.println("");

		}
		System.out.println("Ciclo completado!");
		
		// continue
		System.out.println("   continue    ");

		for (int k = 0; k < 10; k++) {
			
			if (k == 5) {
				continue;
			}
			
			System.out.println(k);
		}
	}

}
