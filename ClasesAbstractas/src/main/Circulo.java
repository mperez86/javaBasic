package main;

public class Circulo extends Figura {

	public static final float pi = 3.1415926f; // atributo de la clase y no hace falta crear el objeto.
	public float radio = 0f; // atributo de instancia
	
	public Circulo(float radio) {
		this.radio = radio;
	}
	
	@Override
	public float area() {
		return Circulo.pi * (this.radio * this.radio);
	}

}
