package main;

public class Circulo {

	// final hace que no se modifique el valor
	public static final float pi = 3.1415926f; // atributo de la clase y no hace falta crear el objeto.
	public float radio = 0f; // atributo de instancia
	
	public Circulo(float radio) {
		this.radio = radio;
	}
	
	public static float area(float radio) {
		return Circulo.pi * (radio * radio);
	}
}
