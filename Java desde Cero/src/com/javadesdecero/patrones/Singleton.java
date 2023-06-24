package com.javadesdecero.patrones;

public class Singleton {

	/*
	 * Se usa cuando queremos que solo se instancie un objeto de la misma clase.
	 * 
	 * Osea que solo haya un objeto a la vez de la misma clase.
	 * 
	 * 
	 * 
	 */

	private static Singleton instanciaUnica;
	
	public Singleton() {}

	public static Singleton getInstancia() {
		
		if ( instanciaUnica == null ) {
			instanciaUnica = new Singleton();
		}
		
		return instanciaUnica;
		
	}
	
	public void unMetodo() {
		System.out.println("Soy un metodo de instanciaUnica");
	}
	
}
