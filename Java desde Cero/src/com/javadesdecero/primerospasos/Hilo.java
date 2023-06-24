package com.javadesdecero.primerospasos;

public class Hilo extends Thread{

	@Override
	public void run() {
		contar();
	}
	
	public void contar() {
		for(int i = 0; i < 100; i++) {
			System.out.println(i + " en " + this.getName());
		}
	}
	
	

}
