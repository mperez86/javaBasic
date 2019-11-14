package main;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Crear un matriz de 5 x 5
		int matriz[][] = new int [5][5];

		// Llenar la matriz con números aleatorios.
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int)(Math.random() * 100);
			}
		}
		
		int sum = 0, cont = 0, mayor = 0, contMayor = 0;
		
		for (int row[] : matriz) {
			for (int celda : row) {
				sum += celda;
				cont++;
				if (celda > mayor) {
					mayor = celda;
					contMayor = 0;
				}
				if (mayor == celda)
					contMayor++;
				
				System.out.print(celda + " ");
			}
		}
		System.out.println("");
		
		// Mostrar en consola el promedio de la matriz.
		int prom = sum / cont;
		System.out.println("El promedio es " + prom);
		// Mostrar en consola el número mayor y la cantidad de veces que este se repite
		System.out.println("El mayot es " + mayor + " y aparece " + contMayor + " veces.");
		
		// Mostrar en consola todos los números primos
		System.out.println("Numeros primos: ");
		for (int row[] : matriz) {
			for (int celda : row) {
				int cont2 = 0;
				for (int i = 1; i <= celda; i++)  {
					if (celda % i == 0)
						cont2++;
				}
				if (cont2 <= 2)
					System.out.print(celda + " ");
			}
		}
		
		// Mostrar en consola todos los números pares.
		System.out.println("Numeros pares: ");
		for (int row[] : matriz) {
			for (int celda : row) {
				if (celda % 2 == 0)
					System.out.print(celda + " ");
			}
		}
		System.out.println("");
		// Mostrar en consola la suma de las diagonales
		
		// Mostrar en consola la suma de la la última fila.
		int sumLastRow = 0, contRow = 0;
		for (int lastRow[] : matriz) {
			if(contRow == matriz.length-1)
			{
				for (int colum : lastRow) {
					sumLastRow += colum;
				}
			}
			contRow++;
		}
		System.out.println("Suma de la última columna: " + sumLastRow);
		
		 //Mostrar en consola la suma de las diagonales
        //diagonal izq a der
        int su=0, tot=0;
        for(int contador=0; contador<matriz.length;contador++) {
            int f=0;
            for (int contador2=0 ;contador2<matriz[contador].length ;contador2++) {
            su=matriz[contador][contador2];
            if(f==contador)
                break;
            else f++;
            }
            tot+=su;
        }
        //diagonal der a izq
        for(int contador=0; contador<matriz.length;contador++) {
            for (int contador2=0 ;contador2<matriz[contador].length-contador;contador2++) {
            su=matriz[contador][contador2];
            }
            tot+=su;
        }
        System.out.print("Las suma de las diagonales es: "+tot);
                
	}

}
