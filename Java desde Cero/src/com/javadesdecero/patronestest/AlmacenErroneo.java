package com.javadesdecero.patronestest;

public class AlmacenErroneo implements IAlmacenable{

	int stock;
	
	public void almacenar(int cantidad) {
		System.out.println("Almacen Erroneo");
	}
	
	public void vaciar(int cantidad) {
		System.out.println("Almacen Erroneo");
	}
	
}
