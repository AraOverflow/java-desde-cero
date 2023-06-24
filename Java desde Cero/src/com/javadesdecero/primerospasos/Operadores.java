package com.javadesdecero.primerospasos;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*
		 * Operadores Aritmeticos
		 * Suma +
		 * Resta -
		 * Multiplicacion *
		 * División /
		 * modulo %
		 * ++
		 * --
		 * 
		 * asignación =
		 * 
		 * 
		 * Operadores de comparación
		 * igual que ==
		 * distinto a !=
		 * mayor que >
		 * menor que <
		 * mayor o igual que >=
		 * menor o igual que <=
		 * 
		 * Operadores lógicos
		 * Y &&
		 * O ||
		 * negación !
		 */
		
		
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		
		int resultado;
		boolean resultadorBool;
		
		numero1 = 2;
		numero2 = 1;
		numero3 = 3;
		numero4 = 5;
		numero5 = 8;
		int numero6 = 2;	
		resultado = numero1 + numero2;
		resultado = numero1 - numero2;
		resultado = numero1 * numero2;
		resultado = numero1 / numero2;
		resultado = numero5 % numero1;
		
		System.out.println(resultado);
		
		//resultado += numero5;
		resultado = resultado + numero5;
		
		System.out.println(resultado);
		
		resultadorBool = numero1 < numero2;
		resultadorBool = numero1 > numero2;
		resultadorBool = numero1 == numero6;
		
		
		//System.out.println(resultadorBool);
		
		
		resultadorBool = (numero1 > numero2) && (numero5 < numero4);
		resultadorBool = !(numero1 < numero2) || (numero5 < numero4);
		
		
		//System.out.println(resultadorBool);
		

	}

}
