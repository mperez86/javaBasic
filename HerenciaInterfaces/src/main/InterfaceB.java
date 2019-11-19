package main;

public interface InterfaceB {

	public void mostraMensaje();
	
	// metodo default
	// al tener un cuerpo no será necesario 
	// que las clases lo implemeten
	// podemos sobreescribirlos
	public default void saluda() {
		System.out.println("Hola Mundo desde una interfaz");
	}
}
