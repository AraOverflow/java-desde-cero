package com.javadesdecero.patrones;

public class ComputadoraBuilder {
	
	Computadora computadora;
	
	public ComputadoraBuilder(String procesador) {
		computadora = new Computadora();
		computadora.setProcesador(procesador);
	}
	
	public ComputadoraBuilder setGrafica(String grafica) {
		computadora.setGrafica(grafica);
		return this;
		
	}
	
	public ComputadoraBuilder setPlacaBase(String placaBase) {
		computadora.setPlacaBase(placaBase);
		return this;
	}
	
	public ComputadoraBuilder setColor (String color) {
		computadora.setColor(color);
		return this;
	}
	
	public ComputadoraBuilder setdisTeclas (String disTeclas) {
		computadora.setDisTeclas(disTeclas);
		return this;
	}
	
	public ComputadoraBuilder setPantalla (String pantalla) {
		computadora.setPantalla(pantalla);
		return this;
	}
	
	public ComputadoraBuilder setGhz (double ghz) {
		computadora.setGhz(ghz);
		return this;
	}
	
	public ComputadoraBuilder setGbRam (double gbRam) {
		computadora.setGbRam(gbRam);
		return this;
	}
	
	public ComputadoraBuilder setGbHD (double gbHD) {
		computadora.setGbHD(gbHD);
		return this;
	}
	
	public ComputadoraBuilder setLectorTarjetas (boolean lectorTarjetas) {
		computadora.setLectorTarjetas(lectorTarjetas);
		return this;
	}
	
	public Computadora build() {
		return this.computadora;
	}

}
