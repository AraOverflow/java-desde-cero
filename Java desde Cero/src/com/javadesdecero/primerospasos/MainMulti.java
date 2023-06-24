package com.javadesdecero.primerospasos;

public class MainMulti {

	public static void main(String[] args) {
		
		/*Hilo primerhilo = new Hilo();
		Hilo segundohilo = new Hilo();
		
		primerhilo.setName("Primer Hilo");
		segundohilo.setName("Segundo Hilo");
		
		primerhilo.start();
		segundohilo.start(); 
		
		HiloCajas hilo1 = new HiloCajas();
		HiloCajas hilo2 = new HiloCajas();
		
		hilo1.start();
		hilo2.start(); */
		
		StockHilo stock = new StockHilo(50);
		
		HiloStock vender = new HiloStock(stock);
		LlenarStock llenar = new LlenarStock(stock);
		LlenarStock llenar2 = new LlenarStock(stock);
		LlenarStock llenar3 = new LlenarStock(stock);
		LlenarStock llenar4 = new LlenarStock(stock);
		LlenarStock llenar5 = new LlenarStock(stock);
		
		
		vender.start();
		llenar.start();
		llenar2.start();
		llenar3.start();
		llenar4.start();
		llenar5.start();
		
	}

}
