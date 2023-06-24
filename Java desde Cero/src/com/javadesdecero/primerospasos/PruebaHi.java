package com.javadesdecero.primerospasos;

import java.util.Random;

public class PruebaHi extends Thread{
    static int caja1 = 1000;
    static int caja2 = 1000;

    @Override
    public void run(){
        caja();

        }

    public static synchronized void caja(){
        int azar;
        Random ramdon = new Random();
        for (int i = 0; i < 100; i++) {
            azar = ramdon.nextInt(2);
            if (azar == 0) {
                caja1 += 10;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                caja2 -= 10;

            } else {
                caja1 -= 10;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                caja2 += 10;
            }



            System.out.println(caja1+caja2);
        }
    }


}
