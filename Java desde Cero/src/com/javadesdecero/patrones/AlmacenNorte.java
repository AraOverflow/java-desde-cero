package com.javadesdecero.patrones;

public class AlmacenNorte implements IAlmacenable{

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
