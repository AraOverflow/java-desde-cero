package com.javadesdecero.primerospasos;

public class PruebaHi2 extends Thread{
    Stock stock;

    public PruebaHi2(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void run() {
        ejecuta();
    }

    public void ejecuta(){
        synchronized (stock) {
            if (stock.getStock() < 100) {
                System.out.println(stock.getStock());
                System.out.println("Stock insuficiente esperando Stock");
               /* try {
                    stock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("vendo");
                stock.setStock(stock.getStock() - 10);*/
            }
            else{
                System.out.println("vendo");
                stock.setStock(stock.getStock() - 10);
            }

        }
    }

}
