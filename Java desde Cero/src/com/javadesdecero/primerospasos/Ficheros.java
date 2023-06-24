package com.javadesdecero.primerospasos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Utilizaremos Buffers tanto para escritura como para lectura para 
		 * minimizar los accesos al HD.
		 * 
		 * El manejo de ficheros puede lanzar excepciones IOException
		 * 
		 */
		
		/*try {
			leerFichero();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}*/
		
		try {
			escribirFichero();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		}
		
		public static void leerFichero() throws IOException{
			
			
			FileReader fichero = new FileReader("C:/Curso_Java/fichero.txt");
			BufferedReader bfLectura = new BufferedReader(fichero);
			
			String linea;
			
			while ((linea = bfLectura.readLine()) != null) {
				System.out.println(linea);
			}
		}
		
		public static void escribirFichero() throws IOException {
			FileWriter fichero = new FileWriter("C:/Curso_Java/fichero.txt", true);
			BufferedWriter bfEscritura = new BufferedWriter(fichero);
			
			bfEscritura.write("\n intentando hacer append");
			bfEscritura.write("\n a ver si me sale bien");
			
			bfEscritura.flush();
		}

	

}
