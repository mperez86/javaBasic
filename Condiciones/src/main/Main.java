package main;

public class Main {

	public static void main(String[] args) {
		// Condiciones
		// if

		String colorLuz = "Verde";
		
		if ( colorLuz.equals("Verde") ) {
			System.out.println("Puede continuar");
		} else if ( colorLuz.equals("Amarillo") ) {
			System.out.println("Alto parcial");
		} else if ( colorLuz.equals("Amarillo") ) {
			System.out.println("Alto total");
		} else {
			System.out.println("Color no v�lido");
		}
	}

}
