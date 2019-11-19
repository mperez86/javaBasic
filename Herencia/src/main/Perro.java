package main;

public class Perro extends Mascota {

	/* Sobre escritura del constructor.
	 Si el constructor padre tiene parámetros, este debe ser sobreescrito
	 con los argumentos correspondientes. Si no tiene argumentos, no es necesario.*/
	public Perro(String nombre, String raza, int edad) {
		super(nombre, raza, edad);
	}
	
	// sobre escritura de métodos
	
	@Override
	public void dormir() {
		super.dormir(); // super = Clase Padre
		System.out.println("El perro está dormido.");
	}
	
}
