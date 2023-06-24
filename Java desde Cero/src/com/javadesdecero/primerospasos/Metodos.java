package com.javadesdecero.primerospasos;

public class Metodos {
	
	static int numero1 = 8;
	static int numero2 = 6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * public -> podemos acceder al metodo desde cualquier parte.
		 * protected -> podemos acceder al metodo desde el mismo paquete y las
		 * clases hijas.
		 * private -> solo podemos acceder al metodo desde la misma clase.
		 * 
		 * static -> un metodo de clase, no hace falta instanciar la clase para usarlo
		 * 
		 * void -> el metodo no va a devolver nada.
		 * tipo de dato -> tipo de dato a devolver por el metodo.
		 * 
		 * () -> los argumentos, datos que recibe el metodo.
		 */
		
		suma();
		System.out.println(sumaDos());
		System.out.println(sumaTres(7, 9));
			
	}
	
	public static void suma() {
		int suma = numero1 + numero2;
		System.out.println(suma);
	}

	protected static int sumaDos() {
		int suma = numero1 + numero2;
		return suma;
	}
	
	private static int sumaTres(int numero1, int numero2) {
		int suma = numero1 + numero2;
		return suma;
	}
}
