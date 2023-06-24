package com.javadesdecero.patrones;

public class Main {

	public static void main(String[] args) {
		
		
		//BUILDER
		
		Computadora computadora = new ComputadoraBuilder("intel i7").setGrafica("Nvidia 3080").setColor("Negro")
									.setLectorTarjetas(true).setGbHD(4000).build();
		
		Computadora computadora2 = new ComputadoraBuilder("intel i7").setColor("Negro")
				.setLectorTarjetas(true).setGbHD(4000).build();
		
		System.out.println(computadora.getGrafica());
		System.out.println(computadora2.getGrafica());
		
		//PROTOTYPE
		
		Computadora computadora3 = computadora.clonar();
		
		System.out.println(computadora.getProcesador()+" "+computadora.getGrafica()+" "+computadora.getColor()+" "+computadora.getGbHD());
		System.out.println(computadora3.getProcesador()+" "+computadora3.getGrafica()+" "+computadora3.getColor()+" "+computadora3.getGbHD());
		
		System.out.println(computadora +" "+ computadora3);
	}

}
