package com.javadesdecero.patrones;

public class Computadora implements ICompClonador {
	
	private String procesador;
	private String grafica;
	private double ghz;
	private String placaBase;
	private boolean lectorTarjetas;
	private double gbRam;
	private String color;
	private String disTeclas;
	private double gbHD;
	private String pantalla;
	
	public Computadora() {}
	
	public Computadora(String procesador, String grafica, double ghz, String placaBase, boolean lectorTarjetas,
			double gbRam, String color, String disTeclas, double gbHD, String pantalla) {
		super();
		this.procesador = procesador;
		this.grafica = grafica;
		this.ghz = ghz;
		this.placaBase = placaBase;
		this.lectorTarjetas = lectorTarjetas;
		this.gbRam = gbRam;
		this.color = color;
		this.disTeclas = disTeclas;
		this.gbHD = gbHD;
		this.pantalla = pantalla;
	}

	public Computadora(String procesador, String grafica) {
		super();
		this.procesador = procesador;
		this.grafica = grafica;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getGrafica() {
		return grafica;
	}

	public void setGrafica(String grafica) {
		this.grafica = grafica;
	}

	public double getGhz() {
		return ghz;
	}

	public void setGhz(double ghz) {
		this.ghz = ghz;
	}

	public String getPlacaBase() {
		return placaBase;
	}

	public void setPlacaBase(String placaBase) {
		this.placaBase = placaBase;
	}

	public boolean isLectorTarjetas() {
		return lectorTarjetas;
	}

	public void setLectorTarjetas(boolean lectorTarjetas) {
		this.lectorTarjetas = lectorTarjetas;
	}

	public double getGbRam() {
		return gbRam;
	}

	public void setGbRam(double gbRam) {
		this.gbRam = gbRam;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDisTeclas() {
		return disTeclas;
	}

	public void setDisTeclas(String disTeclas) {
		this.disTeclas = disTeclas;
	}

	public double getGbHD() {
		return gbHD;
	}

	public void setGbHD(double gbHD) {
		this.gbHD = gbHD;
	}

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}
	
	public Computadora clonar() {
		
		Computadora computadora = null;
		
		try {
			computadora = (Computadora)this.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return computadora;
		
	}
	
	
	
	
	

	
	
}
