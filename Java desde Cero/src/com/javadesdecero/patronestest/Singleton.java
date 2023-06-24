package com.javadesdecero.patronestest;

public class Singleton {
	
	private static Singleton unicaInstancia;
	
	private Singleton() {}
	
	public static Singleton getInstancia() {
		if(unicaInstancia == null) {
			unicaInstancia = new Singleton();
		}
		return unicaInstancia;
	}
	
	public void unMetodo() {
		System.out.println("Esto es un metodo");
	}

}
