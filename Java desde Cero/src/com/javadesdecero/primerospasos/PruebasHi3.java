package com.javadesdecero.primerospasos;

public class PruebasHi3 extends Thread{

    Stock stock;

    public PruebasHi3 (Stock stock)
    {
        this.stock = stock;
    }
    @Override
    public void run() {
        synchronized (stock){
            System.out.println(stock.getStock());
            stock.setStock(stock.getStock()+10);

            if (stock.getStock()>=100)
            {
                stock.notify();
            }
        }
    }
}
