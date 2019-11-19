package main;

public class Main {

	public static void main(String[] args) {
		// Herencia 
		
		Perro perro = new Perro("Perro", "perro", 4);
		Gato gato = new Gato("Gato", "gato", 5);
		
		perro.dormir();
		gato.dormir();
		
		// también se puede instanciar la clase padre
		Mascota mascota = new Mascota("Pez", "pez", 1);
		mascota.setNombre("pez");
		mascota.dormir();
		
		// comprobamos la sobre escritura del construct 
		perro.setNombre("Perro");
	}

}
