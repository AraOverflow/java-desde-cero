package com.javadesdecero.sokects;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import com.javadesdecero.primerospasos.*;

public class Cliente2 {

	public static void main(String[] args) {
		
		Alumno alumno = new Alumno("Ana", "Gonzalez", 6);
		
		try {
			Socket socket = new Socket("127.0.0.1",8765);
			ObjectOutputStream flujo_salida = new ObjectOutputStream(socket.getOutputStream());
			flujo_salida.writeObject(alumno);
			socket.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
