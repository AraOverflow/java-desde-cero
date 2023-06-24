package com.javadesdecero.patronestest;

public class ComputadoraBuilder {
	
	Computador computador;
	
	public ComputadoraBuilder(String procesador) {
		computador = new Computador();
		computador.setProcesador(procesador);
		
	}
	
	public ComputadoraBuilder setGrafica (String grafica) {
		computador.setGrafica(grafica);
		return this;
	}
	
	public ComputadoraBuilder setplacaBase (String placaBase) {
		computador.setPlacaBase(placaBase);
		return this;
	}
	
	public ComputadoraBuilder setColor (String color) {
		computador.setColor(color);
		return this;
	}
	
	public ComputadoraBuilder setdisTeclas (String disTeclas) {
		computador.setDisTeclas(disTeclas);
		return this;
	}
	
	public ComputadoraBuilder setPantalla (String pantalla) {
		computador.setPantalla(pantalla);
		return this;
	}
	
	public ComputadoraBuilder setGhz (double ghz) {
		computador.setGhz(ghz);
		return this;
	}
	
	public ComputadoraBuilder setGbRam (double gbRam) {
		computador.setGbRam(gbRam);
		return this;
	}
	
	public ComputadoraBuilder setGbHD (double gbHD) {
		computador.setGbHD(gbHD);
		return this;
	}
	
	public ComputadoraBuilder setLectorTarjetas (boolean lectorTarjetas) {
		computador.setLectorTarjetas(lectorTarjetas);
		return this;
	}
	
	public Computador build() {
		return this.computador;
	}
}
