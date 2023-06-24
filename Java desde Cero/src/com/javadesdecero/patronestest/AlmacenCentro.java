package com.javadesdecero.patronestest;

public class AlmacenCentro implements IAlmacenable{

	int stock;
	
	public void almacenar(int cantidad) {
		stock += cantidad;
	}
	
	public void vaciar(int cantidad) {
		stock -=cantidad;
	}

	
}
