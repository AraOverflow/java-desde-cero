package com.javadesdecero.primerospasos;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1) solo podremos almacenar un tipo dedato a la vez
		 * 2) el tamaño es inalterable
		 * 3) el indice de los arrays empieza por cero
		 * 
		 */
		
		int[] arraydeEnteros = new int[5];
		String[] arraydeString = {"Hola", "q tal", "adios"};
		int numero1 = 1;
		String palabra = "hola";
		
		arraydeEnteros[2] = 5;
		arraydeEnteros[1] = numero1;
		arraydeEnteros[3] = 67;
		arraydeEnteros[0] = 300;
		arraydeEnteros[4] = 37;
		
		arraydeEnteros[3] = 259;
		
		//System.out.println(arraydeEnteros[3]);
		
		/*for ( int i = 0; i < arraydeEnteros.length; i++) {
			System.out.println(arraydeEnteros[i]);
		}*/
		
		/*for ( int valor : arraydeEnteros) {
			System.out.println(valor);
		}*/
		
		int[][] tabladeEnteros = {{23, 45, 70}, 
								{79, 10, 34}};
		
		//System.out.println(tabladeEnteros[1][2]);
		
		for (int i = 0; i < tabladeEnteros.length; i++) {
			for (int j = 0; j < tabladeEnteros[i].length; j++) {
				System.out.println(tabladeEnteros[i][j]);
			}
		}

	}

}
