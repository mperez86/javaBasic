package main;

public class Gato extends Mascota {
	
	public Gato(String nombre, String raza, int edad) {
		super(nombre, raza, edad);
	}
	
	// sobre escritura de m�todos
	
	@Override
	public void dormir() {
		System.out.println("El gato est� dormido.");
	}
	
}
