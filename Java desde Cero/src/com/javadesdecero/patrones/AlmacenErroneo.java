package com.javadesdecero.patrones;

public class AlmacenErroneo implements IAlmacenable{

	@Override
	public void almacenar(int cantidad) {
		System.out.println("Almacen erroneo");
		
	}

	@Override
	public void vaciar(int cantidad) {
		System.out.println("Almacen erroneo");
		
	}
	
	public int getStock() {
		return 0;
	}
	
	

}
