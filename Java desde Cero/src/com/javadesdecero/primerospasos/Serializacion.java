package com.javadesdecero.primerospasos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializacion {

	public static void main(String[] args) {
		
		Alumno alumno = new Alumno("Juan", "Perez", 7);
		
		try {
			//ObjectOutputStream flujo_salida = new ObjectOutputStream(new FileOutputStream("C:/Curso_Java/fichero.bin"));
			//flujo_salida.writeObject(alumno);
			//flujo_salida.close();
			
			ObjectInputStream flujo_entrada = new ObjectInputStream(new FileInputStream("C:/Curso_Java/fichero.bin"));
			Alumno alumno_entrada = (Alumno) flujo_entrada.readObject();
			
			System.out.println(alumno_entrada.getNombre());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}

}
