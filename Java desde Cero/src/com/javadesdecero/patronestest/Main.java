package com.javadesdecero.patronestest;
public class Main {

	public static void main(String[] args) {
		
		
		//BUILDER
		
		Computador computador = new ComputadoraBuilder("intel i7").build();
		Computador computador2 = new ComputadoraBuilder("Amd").setPantalla("Samsung").build();
		
		System.out.println(computador.getColor());
		System.out.println(computador.getProcesador());
		
		System.out.println(computador2.getPantalla());
		System.out.println(computador2.getGrafica());
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////
	
		//PROTOTYPE
		
		Computador computador3 = computador2.clonar();
		
		System.out.println(computador3.getProcesador() + " " + computador3.getPantalla());
		
		System.out.println(computador2 + " " + computador3);

	}

}
