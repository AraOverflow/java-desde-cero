package com.javadesdecero.patrones;

public class FactoryAlmacen {
	
	/*
	 * Se usa cuando tenemos varias clases que hacen lo mismo pero de manera diferente.
	 * 
	 * El objeto de la clase Factory se va a encargar de crear y devolver el objeto de la clase que le pidamos.
	 * 
	 * 
	 */
	
	public IAlmacenable getAlmacenable(String zona) {
		
		if (zona == null) {
			return new AlmacenErroneo();
		}
		
		if (zona.equalsIgnoreCase("norte")) {
			return new AlmacenNorte();
		}
		
		if (zona.equalsIgnoreCase("centro")) {
			return new AlmacenCentro();		
			
		}
		
		if (zona.equalsIgnoreCase("sur")){
			return new AlmacenSur();
		}
		
		return new AlmacenErroneo();
		
	}

}
