package com.javadesdecero.primerospasos;

public class ClaseGenerica<t> {
	
	private t propiedadGenerica;
	
	public ClaseGenerica(t propiedadGenerica) {
		this.propiedadGenerica = propiedadGenerica;
	}

	public t getPropiedadGenerica() {
		return propiedadGenerica;
	}

	public void setPropiedadGenerica(t propiedadGenerica) {
		this.propiedadGenerica = propiedadGenerica;
	}
	
	

}
