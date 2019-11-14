package main;

public class Perro {
	
	String nombre;
	String raza;
	int edad;
	
	void establecerParametros(String nombre, String raza, int edad) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}
	
	void comer() {
		System.out.println("El perro se encuentra comiendo!");
	}
	
	void dormir() {
		System.out.println("El perro se encuentra dormido!");
	}
	
	void ladrar() {
		System.out.println("El perro se encuentra ladrando!");
	}
}
