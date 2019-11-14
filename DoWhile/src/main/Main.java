package main;

public class Main {

	public static void main(String[] args) {
		// Do While
		int contador = 10;
		
		// While primero se evalua y posteriormente se ejecuta el bloque
		// Do while primero se ejequeta el bloque y despues se ejecuta
		
		while (contador < 10) {
			System.out.println(contador);
			contador++;
			
		}
		
		do {
			System.out.println(contador);
			contador++;
		} while (contador < 10);

	}

}
