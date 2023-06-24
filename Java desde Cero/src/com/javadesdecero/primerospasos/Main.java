package com.javadesdecero.primerospasos;

public class Main {
    public static void main(String[] args) {


//Primer Ejemplo
        HiloEjemplo primerHilo = new HiloEjemplo();
        HiloEjemplo primerHilo2 = new HiloEjemplo();

        primerHilo.setName("Primer Hilo");
        primerHilo2.setName("Segundo Hilo");

        primerHilo.start();
        primerHilo2.start();



//Segundo Ejemplo cajas
    PruebaHi hilo = new PruebaHi();
	PruebaHi hilo2 = new PruebaHi();

//Tercer Ejemplo Stock
    Stock stock = new Stock(50);

    PruebaHi2 hilo3 = new PruebaHi2(stock);
    PruebasHi3 hilo4 = new PruebasHi3(stock);
    PruebasHi3 hilo5 = new PruebasHi3(stock);
    PruebasHi3 hilo6 = new PruebasHi3(stock);
    PruebasHi3 hilo7 = new PruebasHi3(stock);
    PruebasHi3 hilo8 = new PruebasHi3(stock);
    PruebasHi3 hilo9 = new PruebasHi3(stock);
    PruebaHi2 hilo10 = new PruebaHi2(stock);


	hilo.start();
	hilo2.start();

    hilo3.start();//hilo espera
    hilo4.start();//hilo incrementa a 60
    hilo5.start();//hilo incrementa a 70
    hilo6.start();//hilo incrementa a 80
    hilo7.start();//hilo incrementa a 90
    hilo8.start();//hilo incrementa a 100, vende se queda en 90
    hilo9.start();//hilo incrementa a 100
    hilo10.start();





    }
}