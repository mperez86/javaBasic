package main;

// las clases abstractas no pueden ser instanciadas
// pueden ser heredadas
// tienen que tener al menos un método abstracto

public abstract class Figura {

	private int numLados;
	
	public Figura() {
		this.numLados = 0;
	}
	
	public abstract float area();
}
