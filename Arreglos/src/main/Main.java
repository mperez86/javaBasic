package main;

public class Main {

	public static void main(String[] args) {
		// Arrays
		
//		String nombres[];
//		nombres = new String[3];
		
//		String nombres[] = new String[3];
		
		String nombres[] = {"Manuel", "Jos�", "Antonio"};
		
//		nombres[0] = "Manolo";
//		nombres[1] = "Jos�";
//		nombres[2] = "Antonio";
//		nombres[0] = "Manuel";
//		
//		System.out.println(nombres[0]);
//		System.out.println(nombres[1]);
//		System.out.println(nombres[2]);
		
		int calificaciones[] = { 9, 8, 7, 5, 3, 8, 7, 10, 7, 8 };
		int suma = 0;
		System.out.println( calificaciones.length );
		
//		for (int i = 0; i < calificaciones.length; i++) {
		// for each
		for (int calificacion : calificaciones) {
//			suma += calificaciones[i];
			suma += calificacion;
		}
		float promedio = suma / calificaciones.length;
		System.out.println("la suma es " + suma);
		System.out.println("el promedio es " + promedio);

	}

}
