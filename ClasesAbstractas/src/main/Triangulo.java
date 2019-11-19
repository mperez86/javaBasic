package main;

// siempre que extendamos una 
// clase abstracta tendremos que implementar todos sus métodos abstractos
public class Triangulo extends Figura {

	private float base;
	private float altura;
	
	public Triangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public float area() {
		return (this.base * this.altura) / 2;
	}

}
