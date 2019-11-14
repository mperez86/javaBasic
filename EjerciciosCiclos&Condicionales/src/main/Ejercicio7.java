package main;

import java.util.Scanner;


public class Ejercicio7 {

	public static void main(String[] args) {
		// Si numero es primo o no
		
		Scanner getNum = new Scanner(System.in);
		int cont = 0, num;
 
        System.out.print("Ingresa un numero: ");
        num = getNum.nextInt();

        for (int i = 1; i <= num; i++) {
        	
        	if (num % i == 0) {
        		cont++;
        	}
        }
        
        if (cont <= 2) 
        	System.out.println("es primo");
        else
        	System.out.println("no es primo");
	}

}
