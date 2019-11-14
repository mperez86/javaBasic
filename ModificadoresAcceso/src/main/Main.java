package main;

public class Main {

	public static void main(String[] args) {
		// Modificadores de acceso
		
		Usuario manuel = new Usuario("manuel", "pass");
		
		System.out.println(manuel.username);
		System.out.println(manuel.getPassword());
		
		manuel.saluda();
		
		// sobrecarga constructor
		Usuario user1 = new Usuario();
		Usuario user2 = new Usuario("Manuel");
		Usuario user3 = new Usuario("Paco", "PassWord");
		
		user1.saluda();
		user2.saluda();
		user3.saluda();
	}

}
