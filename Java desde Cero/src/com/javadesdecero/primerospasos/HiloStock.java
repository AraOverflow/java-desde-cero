package com.javadesdecero.primerospasos;

public class HiloStock extends Thread {
	StockHilo stock;
	
	public HiloStock (StockHilo stock) {
		this.stock = stock;
	}

	@Override
	public void run() {
		ejecutar();
		
	}
	
	public void ejecutar() {
		synchronized(stock){
			if (stock.getStock() < 100) {
				System.out.println("Stock Insuficiente, Esperando Stock");
				try {
					stock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Vendiendo");
				stock.setStock(stock.getStock()-10);
				
			}
			else {
				System.out.println("Vendiendo");
				stock.setStock(stock.getStock()-10);
			}
		}
		
	}
	
	

}
