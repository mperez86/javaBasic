package main;

public class Main {

	public static void main(String[] args) {
		// Clases y objectos
		
		Perro lassie = new Perro(); // instacia
		
		lassie.establecerParametros("Lassie", "Collie", 4);
		
		System.out.println("El nombre es:  " + lassie.nombre);
		System.out.println("La raza es:  " + lassie.raza);
		System.out.println("La edad es:  " + lassie.edad);

		lassie.comer();
		lassie.dormir();
		lassie.ladrar();
	}

}
