package main;

public class Main {

	public static void main(String[] args) {
		// Herencias interfaces
		
		ClaseFinal c = new ClaseFinal();
		c.mostraMensaje();
		
		// las instancias pueden hacer usuo de los metodos
		// default siempre y cuando estos sean publicos
		c.saluda();

	}

}
