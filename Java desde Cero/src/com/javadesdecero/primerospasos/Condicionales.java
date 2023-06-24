package com.javadesdecero.primerospasos;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Si he ido al gimnasio, como churros.
		 */

		boolean gimnasio;
		boolean megustacomer = false;
		
		gimnasio = false;
		
		int numero1 = 2;
		int numero2 = 5;
		int numero3 = 1;
		int numero4 = 3;
		
		if (numero2>numero1 && numero3 > numero4) {
			System.out.println("Si es mayor");
			
			if(numero2 % 2 == 0) {
				System.out.println("Es un numero par");
			}else
			{
				System.out.println("Es un numero impar");
			}
			
		}else
		{
			System.out.println("Es menor");
		}
		
		int numero5 = 2;
		
		switch (numero5){
		case 1: System.out.println("El numero es 1");
		break;
		case 2: System.out.println("El numero es 2");
		break;
		case 3: System.out.println("El numero es 3");
		break;
		case 4: System.out.println("El numero es 4");
		break;
		case 5: System.out.println("El numero es 5");
		break;
			
		}
	}

}
