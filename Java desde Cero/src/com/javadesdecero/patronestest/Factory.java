package com.javadesdecero.patronestest;

public class Factory {

	public IAlmacenable getAlmacenable(String zona) {
		
		if (zona == null) {
			return new AlmacenErroneo();
		}
		
		if (zona.equalsIgnoreCase("sur")) {
			return new AlmacenSur();
		}
		
		if (zona.equalsIgnoreCase("norte")) {
			return new AlmacenNorte();
		}
		
		if (zona.equalsIgnoreCase("centro")) {
			return new AlmacenCentro();
		}
		
		return new AlmacenErroneo();
		
	}
	
}
