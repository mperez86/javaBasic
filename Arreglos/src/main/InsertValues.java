package main;

public class InsertValues {

	public static void main(String[] args) {
		// insertar valores
		int values[] = new int [30];
		
		for (int i = 0; i < values.length; i++) {
			values[i] = i;
		}
		
		for (int value : values) {
			System.out.println(value);
		}

	}

}
