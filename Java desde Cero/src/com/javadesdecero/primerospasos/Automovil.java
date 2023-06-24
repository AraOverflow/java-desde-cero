package com.javadesdecero.primerospasos;

abstract public class Automovil {
	
	String matricula;
	int npuertas;
	double velocidadMax;
	String modelo;
	boolean ledAlerta = false;
	double velocidadActual = 0;
	
	public Automovil(String matricula, int npuertas, double velocidadMax, String modelo) {
		this.matricula = matricula;
		this.npuertas = npuertas;
		this.velocidadMax = velocidadMax;
		this.modelo = modelo;
		
	}
	
	public void acelerar(double kmh) {
		velocidadActual += kmh;
	}
	
	public void frenar (double kmh) {
		velocidadActual -= kmh;
	}
	
	public void encederAlerta() {
		ledAlerta = true;
	}
	
	abstract public void repostar(double cantidad);
}	
