package main;

public class Main {

	public static void main(String[] args) {
		// Operadores lógicos
		// and (y), or (o) y not (no)
		
		boolean r;
		
		r = 5 >= 5 && true && 10 < 11;
		System.out.println(r);

		r = false || false || false || true;
		System.out.println(r);
		
		r = (5 >= (2 * 3) || true) && (true && 10 >= 9);
		System.out.println(r);
		
		System.out.println(!true);
		System.out.println(!false);
		// true = false
		// false=true
		// !
		
	}

}
