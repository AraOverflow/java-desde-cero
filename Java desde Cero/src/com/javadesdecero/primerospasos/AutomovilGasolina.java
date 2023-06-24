package com.javadesdecero.primerospasos;

public class AutomovilGasolina extends Automovil{

	double litros;
	double cc = 1.4;
	
	public AutomovilGasolina(String matricula, int npuertas, double velocidadMax, String modelo, double litros) {
		super(matricula, npuertas, velocidadMax, modelo);
		this.litros = litros;
	}
	
	@Override
	public void repostar(double litros) {
		this.litros += litros;
	}
	
	public void alertaCombustible() {
		super.encederAlerta();
	}
}