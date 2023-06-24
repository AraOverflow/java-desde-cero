package com.javadesdecero.primerospasos;

import java.util.Random;

public class HiloCajas extends Thread{

	static int caja1 = 1000;
	static int caja2 = 1000;
	
	@Override
	public void run() {
		caja();
	}
	
	public synchronized static void caja() {
		int azar;
		
		Random random = new Random();
		
		for (int i = 0; i < 100; i++) {
			azar = random.nextInt(2);
			
			if(azar == 0) {
				caja1 += 10;
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				caja2 -= 10;
			}
			else {
				caja1 -= 10;
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				caja2 += 10;
			}
			
			System.out.println(caja1 + caja2);
		}
		
	}
	
	
	
}
