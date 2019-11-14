package main;

public class Main {

	public static void main(String[] args) {
		// Matrices
		int matriz[][] = new int [4][3];

		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				matriz[x][y] = y + 3;
			}
		}
		
		for (int row[] : matriz) {
			for(int celda : row) {
				System.out.println(celda);
			}
		}
	}

}
