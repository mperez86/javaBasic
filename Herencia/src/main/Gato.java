package main;

public class Gato extends Mascota {
	
	public Gato(String nombre, String raza, int edad) {
		super(nombre, raza, edad);
	}
	
	// sobre escritura de métodos
	
	@Override
	public void dormir() {
		System.out.println("El gato está dormido.");
	}
	
}
