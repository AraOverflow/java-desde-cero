package com.javadesdecero.patrones;

public class AlmacenCentro implements IAlmacenable {

int stock;
	
	
	@Override
	public void almacenar(int cantidad) {
		stock += cantidad;
		
	}

	@Override
	public void vaciar(int cantidad) {
		stock -= cantidad;
		
	}
	
	public int getStock() {
		return stock;
	}
	
}
