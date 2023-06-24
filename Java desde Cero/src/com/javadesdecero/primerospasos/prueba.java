package com.javadesdecero.primerospasos;

import java.util.Scanner;

import javax.swing.*;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entradaTeclado = new Scanner(System.in);
		int[] arraydeEnteros = new int[5];
		float suma = 0;
		
		
		
		
		
			for (int i = 0; i < arraydeEnteros.length; i++) {
				int numero = i + 1;
				System.out.println("introduzca un numero (" + numero + " de 5): ");
				String entrada = entradaTeclado.next();
				arraydeEnteros[i] = Integer.parseInt(entrada);
				}
				
			for(int i = 0; i < arraydeEnteros.length; i++)
			{
				suma += arraydeEnteros[i];
			}
			
			System.out.println("La media es: " + suma/arraydeEnteros.length);
			
			String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
			System.out.println("Mi nombre es: " + nombre);
			

	}

}
