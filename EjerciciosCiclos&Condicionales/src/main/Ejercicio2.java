package main;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Dado 3 números enteros, mostrar en consola los números de 
		forma ascendente, de menor a mayor. 
		Ejemplo Números = 9, 50, 4 Salida = 4, 9, 50*/
		int num1 = 85, num2 = 6, num3 = 25;
        int menor = 0, medio = 0, mayor = 0;
		
		for (int i = 1; i <= 3; i++) {
			
			if(i == 1){
                if(num1 < num2 && num1 < num3){
                    menor = num1;
                }
                else if(num2 < num3 && num2 < num1){
                    menor = num2;
                }
                else if(num3 < num1 && num3 < num2){
                    menor = num3;
                }
            }
            else if(i == 2){
                if(num1 < num2 && num2 < num3 || num1>num2 && num2>num3 ){
                    medio = num2;
                }
                else if(num2 < num3 && num3 < num1 || num3>num1 && num3<num2){
                    medio = num3;
                }
                else if(num3 < num1 && num1 < num2 || num1>num2 && num1<num3){
                    medio = num1;
                }
            }
            else if(i == 3){
                if(num1 > num2 && num1 > num3){
                    mayor = num1;
                }
                else if(num2 > num3 && num2 > num1){
                    mayor = num2;
                }
                else if(num3 > num1 && num3 > num2){
                    mayor = num3;
                } 
            }  
		}
		
		System.out.println("mayor: " + mayor);
		System.out.println("menor: " + menor);
		System.out.println("medio: " + medio);
	}

}
