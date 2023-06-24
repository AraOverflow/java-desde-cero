package com.javadesdecero.primerospasos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String entrada;
		int[] arraydeEnteros = new int[5];
		double suma = 0;
		
		for (int i = 0; i < arraydeEnteros.length; i++) {
			do {
				
				//System.out.println("Introduzca un número, " + (i+1) + " de 5: ");
				//entrada = in.next();
				entrada = JOptionPane.showInputDialog("Introduzca un número, " + (i+1) + " de 5: ");
				
			}while(entrada == null || !entrada.matches("[0-9]+"));
			
			arraydeEnteros[i] = Integer.parseInt(entrada);
		}
		
		for (int valor : arraydeEnteros) {
			suma += valor;
		}
		
		System.out.println("La media es: " + suma/arraydeEnteros.length);

	}

}
