package com.javadesdecero.primerospasos;

public class LlenarStock extends Thread{

	StockHilo stock;
	
	public LlenarStock(StockHilo stock) {
		this.stock = stock;
	}
	
	@Override
	public void run() {
		llenar();
	}
	
	public void llenar() {
		synchronized (stock) {
			stock.setStock(stock.getStock()+10);
			
			if (stock.getStock() >= 100) {
				stock.notify();
			}
		}
	}
}

