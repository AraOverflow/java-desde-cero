package com.javadesdecero.patrones;

public class AlmacenSur implements IAlmacenable {

private int stock;
	
	
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

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
}
