package com.javadesdecero.primerospasos;

public class AutomovilElectrico extends Automovil {
	
	double voltaje;
	double Wattios = 2000.0;
	
	public AutomovilElectrico(String matricula, int npuertas, double velocidadMax, String modelo, double voltaje) {
		super(matricula, npuertas, velocidadMax, modelo);
		this.voltaje = voltaje;
	}
	
	
	public void alertaBateria() {
		super.encederAlerta();
	}
	
	@Override
	public void repostar(double voltaje) {
		this.voltaje += voltaje;
	}

}
